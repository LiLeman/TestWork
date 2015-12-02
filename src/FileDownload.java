

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FileDownload")
public class FileDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String fileName=null;
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType ("text/html;charset=windows-1251");
		PrintWriter out= response.getWriter();
		int index = 0;
		try{index=Integer.parseInt(request.getParameter("indexOfFile"));
		if(FileSystem.setFileSys.containsKey(index)){
			fileName=FileSystem.setFileSys.get(index);
			out.println ("<html><head><title>Отчет</title></head>" +
	 	 	 	"<body>" +"<p>"+"Файл найден, его можно скачть по этой ссылке:"+"</p>"+"<a href="+"FileDownload"+">Downl</a>"+
	 	 	 	"</body></html>");
 	 	}
		else{
			out.println ("Некорректный индекс.");
		}
		
		}
		catch(NumberFormatException e){
			out.println ("Некорректный индекс.");
		}
		
		
		
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("APPLICATION/OCET-STREAM");
		response.setHeader("Content-Disposition", "attachment;filename=\""+fileName+"\"");
		FileInputStream fi= new FileInputStream(FileSystem.filePath+fileName);
		int i;
		while((i=fi.read())!=-1)
			out.write(i);
		out.close();
		fi.close();
	}
}
