import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FileSystem {
    static ConcurrentHashMap<Integer,String> setFileSys =new ConcurrentHashMap<>();
    static String filePath="C:\\storage\\file\\";
    
    public static String deleteFile(int index){
		if (FileSystem.setFileSys.containsKey(index)){
	    	String fileName=FileSystem.setFileSys.get(index);
			FileSystem.setFileSys.remove(index);
	        new File(filePath+fileName).delete();
			return "Файл удален.";	
		}
		else{
			return "Файл с таким индексом не найден.";
		}
    }
    
	 public static String processMap(ConcurrentHashMap<Integer,String> mp, String symbolForSearch) {
		    String  resultOfSearch= "";
		    Iterator it = mp.entrySet().iterator();
		    int i=0;
		    while (it.hasNext()&&i<=25) {
		        Map.Entry pair = (Map.Entry)it.next();
		        String g=(String)pair.getValue();
		        if (g.contains(symbolForSearch)) {
		        	resultOfSearch+="Найденно: " + pair.getKey() + " = " + pair.getValue()+"<br>";
		          i++;
		        }
		    }
			return resultOfSearch;
		    }
    
    
    
    
}
