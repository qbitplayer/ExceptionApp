package main;
import java.util.Scanner;

@SuppressWarnings("resource")
public class Input {
	
	int var;
	public int length; 
	
    public int scannInt(){
    	Scanner reader = new Scanner(System.in);
    	 var =  reader.nextInt();  
    	 //reader.close(); 
    	 return var; 
    }
    
    public static float scannFloat(){
    	Scanner reader = new Scanner(System.in);
    	 float var =  reader.nextFloat();  
    	 //reader.close(); 
    	 return var;
    }
    
    public static String scannLine(){
    
		Scanner reader = new Scanner(System.in);
    	 String var =  reader.nextLine(); 
    	 //reader.close(); 
    	 return var;
    }
    
    
    

}
