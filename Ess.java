import java.io.*;
import java.util.*;
class Ess {  
   public static void main(String args[]) throws IOException
   {
	FileInputStream fis = null;
	/*This constructor FileInputStream(File filename)
	 * throws FileNotFoundException which is a checked
	 * exception*/
	 try{
        fis = new FileInputStream("D:/DV/hello.txt"); 
	 }
	 catch(FileNotFoundException fnfe)
	 {
		 System.out.println("File not Found");
	 }
	int k; 

	/*Method read() of FileInputStream class also throws 
	 * a checked exception: IOException*/
	try
	{
		while(( k = fis.read() ) != -1) 
	{ 
		System.out.print((char)k); 
	} 
}
catch(IOException ioe)
{
	System.out.println("I/O error Occured"+ioe);
}

	/*The method close() closes the file input stream
	 * It throws IOException*/
	fis.close(); 	
   }
}