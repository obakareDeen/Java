package code.example.palindrome;


public class CodeTest {

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String[] palindromes = new String[5];
        
        palindromes[0] = "Race car";
        palindromes[1] = "Olatunji";
        palindromes[2] = "ab cdcba";
        palindromes[3] = "deeneed";
        palindromes[4] = "Never Odd or Even";
        
        for(String palindrome : palindromes)
        {
        	if(CodeTest.isPalindrome(palindrome))
        		System.out.println(palindrome + " is a palindrome!");
        	else
        		System.out.println(palindrome + " is NOT a palindrome!");
        }
    }
    
    public static boolean isPalindrome(String str)
    {
    	str = str.replace(" ", "");
    	return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

}
