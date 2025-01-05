import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mindrot.jbcrypt.BCrypt;
public class ModelComponent {
	Connection con=null;
	PreparedStatement ps1=null;
	PreparedStatement ps2=null;
	int res=0;
	ResultSet rs=null;
	String dpath="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/amazon?user=root&password=4512";
	String query1="insert into users values(?,?,?,?,?)";
	String query2="select * from users where name=? ";
	public ModelComponent() {
		try {
			Class.forName(dpath);
			con=DriverManager.getConnection(url);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public int storeUser(int id,String name,String pwd,String email,String phone){
		try {
			ps1=con.prepareStatement(query1);
			ps1.setInt(1, id);
			ps1.setString(2, name);
			String epwd=encryptPassword(pwd);
			ps1.setString(3, epwd);
			ps1.setString(4, email);
			ps1.setString(5, phone);
			res=ps1.executeUpdate();	
		}catch(Exception e){
			e.printStackTrace();
		}
		return res;
	}
	
	public boolean loginUser(String name,String pwd) {
		try {
			ps2=con.prepareStatement(query2);
			ps2.setString(1, name);
			rs=ps2.executeQuery();
			if(rs.next()){
				String epwd=rs.getString("pwd");
				return checkPassword(pwd,epwd);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static String encryptPassword(String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt()); 
		}
	public static boolean checkPassword(String password, String hashedPassword) { 
		return BCrypt.checkpw(password, hashedPassword); 
	}

}

