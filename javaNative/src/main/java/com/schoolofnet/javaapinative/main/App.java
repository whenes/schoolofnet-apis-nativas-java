package com.schoolofnet.javaapinative.main;

import com.schoolofnet.javaapinative.main.default_code.DefaultCode;
import com.schoolofnet.javaapinative.main.private_code.PrivateCode;
import com.schoolofnet.javaapinative.main.protected_code.ProtectedCode;
import com.schoolofnet.javaapinative.main.protected_code.Second;
import com.schoolofnet.javaapinative.main.public_code.PublicCode;

public class App 
{
    public static void main( String[] args )
    {
    	new PublicCode();
    	
//    	PrivateCode privateCode = new PrivateCode();
//    	privateCode.name; 
    	new PrivateCode();
    	
//    	new ProtectedCode().lastname;
    	new ProtectedCode();
    	new Second();
    	
//    	new DefaultCode();//não instancia, pois o contrutor é default
    	new DefaultCode(33);
    	
//    	new Main();
        System.out.println( "Hello World!" );
    }
}
