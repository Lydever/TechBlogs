package com.itheima.jdbc;
import java.sql.*;

public class JDBCdemo {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url="jdbc:mysql://locahost:3306/jdbc";
			String username="root";
			String password="root";
			conn=DriverManager.getConnection(url,username,password);
			
			//ͨ��Connection�����ȡStatement����
			stmt=conn.createStatement();
			String sql="select*from tb_user";
			rs=stmt.executeQuery(sql);
			System.out.println("id   |  name   |   sex "+"   |   email   ");
			while(rs.next()){
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String sex=rs.getString("sex");
				String email=rs.getString("email");
				System.out.println("id   |   name   |   sex "+"   |   email   ");
				
				
				int det=rs.executeUpdate("delete from users where sex=��");				
				if(det=='��')
					System.out.println("ɾ���ɹ�");
				conn.close();
				
				int insertcont=rs.executeUpdate("insert into from users where id=5");
				if(insertcont>0)
					System.out.println("����ɹ�");
                 conn.close();
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			if(rs!=null){rs.close();}
			if(stmt!=null){stmt.close();}			
			if(conn!=null){conn.close();}
		}

	}

}
