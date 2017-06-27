package main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionsApp {

	
	public static void main(String[] str) { 
			//exampleNoSuchFileException();
		
		exampleInputMismatchException();	
	}
	
    public static void exampleArrayIndexBoundException(){
    	int pares[] = new int[]{2,4,6,8,10};
		// java.lang.ArrayIndexOutOfBoundsException
		for(int i=0; i<=pares.length; i++)
					System.out.println("Numero par " + i + ": " + pares[i]);
		
    }
    
    /**
     * https://docs.oracle.com/javase/7/docs/api/java/util/InputMismatchException.html
     */
    public static void exampleInputMismatchException(){
    	
    			//InputMismatchException
    			System.out.println("Entre un numero");
    		
    			boolean again = false; 
    			int var=0; 
    			do{
    				
    				Scanner reader; 
	    			try{
	    				
	    				reader = new Scanner(System.in);
	    				var = reader.nextInt();
	    				again = false;
	    				reader.close();
	    			}catch(InputMismatchException e){
	    				System.out.println("Por favor digite un numero"); 
	    				again = true;
	    				
	    			}finally{
	    				
	    			}
	    			
    			}while(again); 
    			
    			
    	   		System.out.println("El numero leido es: " + var );
    }
    
    
    /**
     * NoSuchFileException 
     * 
     * https://docs.oracle.com/javase/7/docs/api/java/nio/file/NoSuchFileException.html
     * @throws IOException 
     */
    public static void exampleNoSuchFileException(){
    	
    	List<String> list = null;  
    	
		try {		
			
			Path path = Paths.get("pruebas");
			list =Files.readAllLines(path,StandardCharsets.UTF_8); 
			
		} catch (NoSuchFileException e) {
			
			System.err.println("EL archivo no existe"); 			
			list = new ArrayList<String>();
			
		} catch (IOException e) {
			 list = new ArrayList<String>(); 
		    e.printStackTrace();
		
		}finally{
		    System.out.println("Simpre se ejecuta esto");	 
		}
		
		
		int size = list.size();
		for(int i=0; i<size; i++)
			System.out.println(list.get(i)); 
 	    
    }
    
    
   public static void checkIndex(int index) {	
		if(index<0 || index > 10 ){
			throw new RuntimeException("EL indice debe ser mayor que cero y menor que 10"); 	
		}
	}
    
    
    
    
	
	
	
}
