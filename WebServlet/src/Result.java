

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ResultPage")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Util.ko(request, response);
		System.out.println("이동");
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		String txt = request.getParameter("txt");
		PrintWriter pw = response.getWriter();
		for(int i =0; i < cnt; i++) {
		System.out.println(cnt + " , " + txt);
		pw.append((i + 1) + "." + txt + " ");
			
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("포스트");
		//Util.ko(request, response);
		
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		String txt = request.getParameter("txt");
		PrintWriter pw = response.getWriter();
		for(int i =0; i < cnt; i++) {
		System.out.println(cnt + " , " + txt);
		pw.append((i + 1) + "." + txt + " ");
		
		}
	}

	
	
}
