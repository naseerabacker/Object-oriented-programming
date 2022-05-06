/*program to illustrate the following String manipulation
methods.
1. Create new strings using new.
2. Getting String length
3. String Concatenation
4. Character extraction
5. String Comparison
6. Searching substrings
7. Modifying a string
8. Data conversion using valueOf
*/


class Stringmanipulation
	{
   public static void main(String[] args)
	{
      //newstring using new
      char chs[]={'w','e','l','c','o','m','e'};
      String newstr=new String(chs);
      System.out.println("new string from char[] using new string:"+newstr);
    
      byte asciis[]={65,66,67,68,69};
      String newStr=new String(asciis);
      System.out.println("new string from byte[] using new string:"+newStr);
      String s1="good";
      String s2="morning";
     
      //string length
         System.out.println("length of the string is"+s1.length());
      //to uppercase and lowercase
         System.out.println("____________STRING CASE CHANGE___________");
         System.out.println(s1+"to UpperCase:"+s1.toUpperCase());
         System.out.println(s1+"to LowerCase:"+s1.toLowerCase());  
      //string concatenation
          System.out.println("______STRING CONCAT_________");
    	System.out.println("using concat"+s1.concat(s2));
	System.out.println("using operator + :"+s1+s2);
 	
     //character extraction
	System.out.println("__________CHARACTER EXTRACTION____________");
	System.out.println("character at third position"+s1.charAt(3));
	char c[]=new char[5];
	s1.getChars(2,4,c,0);
	System.out.println("character between 2 and 4:"+new String(c));
     //character comparison
	System.out.println("__________CHARACTER COMPARISON__________");
  	s1="WELCOME";
	s2="welcome";
	System.out.println(s1+"equals"+s2+":"+s1.equals(s2));
	System.out.println(s1+"equalsIgnoreCase" +":"+s1.equalsIgnoreCase(s2));
	   				System.out.println(s1+"compareTo"+s2+":"+s1.compareTo(s2));					       System.out.println(s1+"compareToIgnoreCase"+s2+":"+s1.compareToIgnoreCase(s2));
	
          System.out.println(s1+"startsWith w: "+s1.startsWith("w"));
         	System.out.println(s1+"ends WITH x: "+s1.endsWith("x"));
    //substring search
	System.out.println("__________________SEARCH SUBSTRING__________");
	s1="hello friends";
	System.out.println("index of friends in: 	"+s1+":"+s1.indexOf("friends"));

    //Modifying a string
	System.out.println("__________________STRING MODIFICATION__________");
    s1="WHERE";
    s2="IS MY PEN";
    System.out.println("Substring of  "+s1.substring(0,4));
    System.out.println("Substring of  "+s1.substring(0));
    System.out.println("The trim of string is: "+s1.trim());
    System.out.println("Modify using replace: "+s1.replace("NAME","SUPERNAME"));

    System.out.println("__________DATA CONVERSION USING valueOf()________________");
    int a=4;
    System.out.println("value of "+a+" + "+String.valueOf(a));
}


}


/*
new string from char[] using new string:welcome
new string from byte[] using new string:ABCDE
length of the string is4
____________STRING CASE CHANGE___________
goodto UpperCase:GOOD
goodto LowerCase:good
______STRING CONCAT_________
using concatgoodmorning
using operator + :goodmorning
__________CHARACTER EXTRACTION____________
character at third positiond
character between 2 and 4:od
__________CHARACTER COMPARISON__________
WELCOMEequalswelcome:false
WELCOMEequalsIgnoreCase:true
WELCOMEcompareTowelcome:-32
WELCOMEcompareToIgnoreCasewelcome:0
WELCOMEstartsWith w: false
WELCOMEends WITH x: false
__________________SEARCH SUBSTRING__________
index of friends in: hello friends:6
__________________STRING MODIFICATION__________
Substring of WHER
Substring of WHERE
The trim of string is: WHERE
modify using replace: WHERE
__________DATA CONVERSION USING valueOf()________________
value of 4 + 4

*/
