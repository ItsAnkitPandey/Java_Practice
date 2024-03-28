package abcmart.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import abcmart.dto.Product;
import abcmart.util.DBUtil;

public class ProductDao {
	public Product findProduct(int productId) {
		Connection con = DBUtil.getMySqlConnection();
		String sql = "select * from products where id = ?";
		Product product = null;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, productId);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int pId = rs.getInt(1);
				String pname = rs.getString(2);
				double price = rs.getDouble(3);
				Date mfd = rs.getDate(4);
				String category = rs.getString(5);
				
				product = new Product();
				product.setProductID(pId);
				product.setProductName(pname);
				product.setProductPrice(price);
				product.setMfd(mfd);
				product.setCategory(category);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
			con.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return product;
	}

}
