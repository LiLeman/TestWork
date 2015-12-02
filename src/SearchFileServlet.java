

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchFileServlet
 */
@WebServlet("/SearchFileServlet")
public class SearchFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType ("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out= response.getWriter();
		String fileName=request.getParameter("nameFile");
		if (fileName.length()<1){
			out.println("Параметры поиска заданны небыли");
		} else{
		out.println ("<html><head>" +
	 	 	 	 	"<title>Загрузка файла на сервер</title>" +
	 	 	 	"</head>" +
	 	 	 	"<body>По запросу было найденно:<br>" +FileSystem.processMap(FileSystem.setFileSys,fileName)
	 	 	 	+"</body></html>"
	 	);
		}
	}




}
