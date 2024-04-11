package com.abc.springcore2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springcore2.bean.Player;

public class PlayerMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		Player player1 = (Player) context.getBean("player1");
		
		System.out.println("id: "+ player1.getPlayerId());
		System.out.println("name: "+ player1.getPlayerName());
		System.out.println("Scores: "+ player1.getScores());
		
		context.close();
	}

}
