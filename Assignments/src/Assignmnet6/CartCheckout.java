package Assignmnet6;

import java.math.BigDecimal;
import java.util.Map;

public class CartCheckout {

	public String billGenerator(Map<String, BigDecimal> cart, Double taxPercent) {
		if (cart.isEmpty()) {
			return "The cart Map is empty";
		}

		if (taxPercent == null) {
			return "The taxPercent cannot be null";
		}
		if (taxPercent < 0) {
			return "The taxPercent cannot be negative";
		}

		if (cart.values().stream().anyMatch(value -> value == null || value.compareTo(BigDecimal.ZERO) <= 0)) {
			return "Cart contains invalid values";
		}

		BigDecimal totalCost = cart.values().stream()
				.map(value -> value.multiply(BigDecimal.valueOf(1 + (taxPercent / 100))))
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		return totalCost.toString();
	}

	public static void main(String[] args) {
		CartCheckout checkout = new CartCheckout();

		System.out.println(checkout.billGenerator(Map.of("Apple", BigDecimal.valueOf(54), "Grapes",
				BigDecimal.valueOf(36.78), "Papaya", BigDecimal.valueOf(27.89), "Orange", BigDecimal.valueOf(23.6),
				"Banana", BigDecimal.valueOf(10.2)), 10.5));

		System.out.println(checkout.billGenerator(Map.of(), 13.0));

		System.out.println(checkout.billGenerator(Map.of("Apple", BigDecimal.valueOf(54), "Grapes",
				BigDecimal.valueOf(36.78), "Papaya", BigDecimal.valueOf(27.89), "Orange", BigDecimal.valueOf(23.6),
				"Banana", BigDecimal.valueOf(10.2)), -2.5));

		System.out.println(checkout.billGenerator(Map.of("Apple", BigDecimal.valueOf(54), "Grapes",
				BigDecimal.valueOf(36.78), "Papaya", BigDecimal.valueOf(27.89), "Orange", BigDecimal.valueOf(23.6),
				"Banana", BigDecimal.valueOf(10.2)), null));
	}
}
