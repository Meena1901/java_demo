package com.example.validationPackage;

import java.util.regex.*;

public class validation
{
    public static boolean dateVerification(String date){
        String emailRegex = "^(19|20)\\d\\d([- /.])(0[1-9]|1[012])\\2(0[1-9]|3[01])$";
							
		Pattern pat = Pattern.compile(emailRegex);
		if (date == null)
			return false;
		return pat.matcher(date).matches();
    }


    public static boolean nameVerification(String name){
        String emailRegex = "^[A-Z][A-Za-z]{3,30}$";
							
		Pattern pat = Pattern.compile(emailRegex);
		if (name == null)
			return false;
		return pat.matcher(name).matches();
    }

    public static boolean mobileNoVerification(String mobile)  
    {  
        String emailRegex = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
		//^\\+91[6-9]\\d{9}$					
		Pattern pat = Pattern.compile(emailRegex);
		if (mobile == null)
			return false;
		return pat.matcher(mobile).matches();
        
    }  

    public static boolean emailValidation(String email)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
							"[a-zA-Z0-9_+&*-]+)*@" +
							"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
							"A-Z]{2,7}$";
							
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}
        
}