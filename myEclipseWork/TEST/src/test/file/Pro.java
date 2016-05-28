package test.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

public class Pro {
	public String porper() throws IOException, URISyntaxException{
		System.out.println(this.getClass().getResourceAsStream( "/test/test.properties " ));
		URL url=this.getClass().getResource("/test/test.properties");
		String urlstr=url.toString().substring(6).trim();
		System.out.println("URL="+urlstr);
		InputStream inputStream  = this.getClass().getResourceAsStream( "/test/test.properties " );    
		Properties p  =   new  Properties();      
		p.load(inputStream);
		System.out.println( " –’√˚ «: " + p.getProperty("name" ));
		OutputStream outs=new FileOutputStream(urlstr);
		p.setProperty("update7", "neibuTianjia7777777777");
		p.store(outs, "Update7 " + "neibuTianjia7777777777777" + " name");

		return p.getProperty( "name" );
	}
	
	
}
