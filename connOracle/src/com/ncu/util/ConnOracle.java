package com.ncu.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnOracle {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "scott", "orcl");
			Statement stmt = conn.createStatement();

			String tableName = "student";
			/*
			 * String sql = "select count(*) totalCount from " + tableName;
			 * System.out.println(sql); ResultSet rs = stmt.executeQuery(sql); int rowCount
			 * = 0; while (rs.next()) { rowCount = rs.getInt("totalCount"); }
			 * System.out.println(rowCount);
			 */

			String sql = "select id from student where name='fangmin'";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				int id2 = rs.getInt(1);
				System.out.println(id);
				System.out.println(id2);
			}

			DatabaseMetaData databaseMetaData = conn.getMetaData();
			ResultSet tables = databaseMetaData.getTables(null, null, "%", null);
			ArrayList<String> tablesList = new ArrayList<String>();
			while (tables.next()) {
				tablesList.add(tables.getString("TABLE_NAME"));
				System.out.println(tables.getString("TABLE_NAME"));
			}

			System.out.println(tablesList.contains("student"));
			// SELECT TABLE_NAME,TABLE_COMMENT FROM INFORMATION_SCHEMA.TABLES WHERE
			// TABLE_SCHEMA = 'db_stockmanage';
			/*
			 * while (rs.next()) { System.out.println(rs.getString("name")); }
			 */

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
