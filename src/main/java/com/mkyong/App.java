package com.mkyong;

import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class App 
{

    public static void main( String[] args )
    {   // essaie 4
        //
        //essaie Q
        //essaie 2
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
    }
    
    public String generateUniqueKey(){
    	
    	String id = UUID.randomUUID().toString();
    	return id;
    	
    }
}
