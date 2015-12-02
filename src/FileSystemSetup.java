import java.io.File;

public class FileSystemSetup {
	
	public void createFolder(){
		File myPath = new File("C:\\Storage\\file");
		myPath.mkdir();  
		myPath.mkdirs();
	}	
}