import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			String name=req.getParameter("username");
			String password=req.getParameter("password");
			ModelComponent component=new ModelComponent();
			
			boolean rs=component.loginUser(name,password);
			if(rs) {
				res.sendRedirect("/AmazonApp/dashBoard.html");
			}else {
				res.sendRedirect("/AmazonApp/loginfailure.html");
			}
		}catch(Exception e) {
			e.printStackTrace();
			res.sendRedirect("/AmazonApp/loginfailure.html");
		}

	}	

}
