package Inputpicture;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PictureInput {
	public static void main(String[] args) throws Exception {
    URL url = new URL("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1405513753,2858193846&fm=26&gp=0.jpg");  
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();  
    conn.setRequestMethod("GET");    
    conn.setConnectTimeout(5 * 1000);  
    InputStream inStream = conn.getInputStream();   
    byte[] data = readInputStream(inStream);    
    File imageFile = new File("D://√¿≈ÆÕº∆¨.jpg");  
    FileOutputStream outStream = new FileOutputStream(imageFile);  
    outStream.write(data);   
    outStream.close(); }
	 public static byte[] readInputStream(InputStream inStream) throws Exception{  
	        ByteArrayOutputStream outStream = new ByteArrayOutputStream();  
	    
	        byte[] buffer = new byte[1024];  
	        int len = 0;  
	        while( (len=inStream.read(buffer)) != -1 ){  
	            outStream.write(buffer, 0, len);  
	        }  
	        inStream.close();  
	        return outStream.toByteArray();  
	    }  
}
