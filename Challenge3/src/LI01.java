
public class LI01 
{
	public static void main(String[] args)
	{
		System.out.println((removeDups("yyzzza")));
	}
	
	public static String removeDups(String s)
	{
	    if ( s.length() <= 1 ) return s;
	    if( s.substring(1).contains(s.substring(0,1)) ) return removeDups(s.substring(1));
	    else return s.substring(0,1) + removeDups(s.substring(1));
	}
}
