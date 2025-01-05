

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class UserController extends HttpServlet {


	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		try {
			String id=req.getParameter("id");
			int cid=Integer.parseInt(id);
			String name=req.getParameter("name");
			String pwd=req.getParameter("password");
			String email=req.getParameter("email");
			String phone=req.getParameter("phone");
			ModelComponent component=new ModelComponent();
			if (name == null || pwd == null || email == null || phone == null || name.isEmpty() || pwd.isEmpty() || email.isEmpty()|| phone.isEmpty()){
				res.sendRedirect("/AmazonApp/regfailure.html");
				return;
			}
			int rs=component.storeUser(cid, name, pwd, email, phone);
			if(rs==1) {
				res.sendRedirect("/AmazonApp/regsuccess.html");
			}else {
				res.sendRedirect("/AmazonApp/regfailure.html");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
