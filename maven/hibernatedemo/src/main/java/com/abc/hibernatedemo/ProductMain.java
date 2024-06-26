
package com.abc.hibernatedemo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import com.abc.hibernatedemo.entity.Products;
import com.abc.hibernatedemo.util.DBUtil;

public class ProductMain {

	public static void main(String[] args) {
		
		Products product1 = new Products();
		product1.setId(101);
		product1.setProductName("Samsung GalaxyM50");
		product1.setPrice(38000);
		product1.setMfd(LocalDate.of(2024, 04, 8));
		product1.setCategory("Mobile");
		
		//how to persist ( save to database)
		
		String sql = "insert into products values(?,?,?,?,?)";
		
		try(Connection con= DBUtil.getOracelDBConnection();
			PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setInt(1, product1.getId());
			ps.setString(2, product1.getProductName() );
			ps.setDouble(3, product1.getPrice());
			ps.setDate(4, Date.valueOf(product1.getMfd()));
			ps.setString(5, product1.getCategory());
			
			ps.executeUpdate();
			System.out.println("Product saved!");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
