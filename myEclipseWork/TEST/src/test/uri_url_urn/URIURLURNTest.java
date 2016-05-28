package test.uri_url_urn;

import java.net.URI;
import java.net.URISyntaxException;

public class URIURLURNTest {

	/**
	 * @param args
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws URISyntaxException {
		// TODO Auto-generated method stub
		//String uri=Object.class.getResource("/URIURLURNTest.java").toString().trim();
		//System.out.println(uri);
		URI uri =int.class.getResource("test/uri_url_urn/URIURLURNTest.class").toURI();
		System.out.println(uri.isAbsolute());
		System.out.println(uri.isOpaque());
		
		
	}

}
