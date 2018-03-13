

import junit.framework.TestCase;
import java.util.Random;
import java.io.*;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {

	String[] validSchemes = {"http://", "ftp://", "h3t://", ""};
	String[] invalidSchemes = {"3ht://", "http:/", "http:", "http/", "://"};
	
	String[] validAuthority = {"www.google.com", "google.com", "www.amazon.com", "0.0.0.0", "255.255.255.255"};
	String[] invalidAuthority = {"go.a", "256.256.256.256", "1.2.3.4", "google"};
	
	String[] validPort = {":80", ":0", ""};
	String[] invalidPort = {":-1", ":65a", ":65636"};
	
	String[] validPath = {"/test", "/test/", "/$23", "/test/test"};
	String[] invalidPath = {"/..", "/test//test", "/../"};
	
	
   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest() throws IOException
   {
	   //You can use this function to implement your manual testing	   
	   //Code suggested by "Java A Beginner's Guid, 6th Edition" by Schildt, Herbert, 2014
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String url;
	   System.out.println("Enter URLs for testing, one per line. Type 'stop' on a line by itself to quit");
	   do {
		   url = br.readLine();
		   System.out.println(urlVal.isValid(url));
	      } while(!url.equals("stop"));
   }
   
   // test different schemes
   public void testYourFirstPartition()
   {
	 //You can use this function to implement your First Partition testing	   
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String url;
	   int randAuth, randPort, randPath;
	   boolean valid;
	   
	   Random rand = new Random();
	   
	   for(int i = 0; i < validSchemes.length; i++) {
		   randAuth = rand.nextInt(5);
		   randPort = rand.nextInt(3);
		   randPath = rand.nextInt(4);
		   
		   url = validSchemes[i] + validAuthority[randAuth] + validPort[randPort] + validPath[randPath];
		   
		   System.out.println("Testing URL: " + url);
		   
		   valid = urlVal.isValid(url);
		   
		   System.out.println("Expected Result: true; Actual Result: " + valid);
	   }
	   
   }
   
   public void testYourSecondPartition(){
		 //You can use this function to implement your Second Partition testing	   

   }
   //You need to create more test cases for your Partitions if you need to 
   
   public void testIsValid()
   {
	   //You can use this function for programming based testing

   }
   
   public static void main(String args[]) throws IOException
   {
	   UrlValidatorTest fct = new UrlValidatorTest("url test");
	   fct.testManualTest();
	   fct.testYourFirstPartition();
   }

}
