

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteFronmFileSyst")
public class DeleteFronmFileSyst extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFronmFileSyst() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType ("text/html;charset=UTF-8");
		int index = 0;
		String messageAboutDelete = null;

		try{index=Integer.parseInt(request.getParameter("indexOfFile"));
		messageAboutDelete=FileSystem.deleteFile(index);
		}
		catch(NumberFormatException e){
			messageAboutDelete="Некорректный индекс.";
		}
		
		;
		PrintWriter out =response.getWriter();
 	 	out.println ("<html><head><title>Отчет</title></head>" +
	 	 	 	"<body>" +"<p>"+ messageAboutDelete+"</p>"+
	 	 	 	
	 	 	 	"</body></html>"
	 	);

	}

}
