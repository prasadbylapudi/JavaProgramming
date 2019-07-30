import java.util.*;
class string_fun
{
public static void main(String ar[])
{
System.out.print("Enter a String:");
Scanner a=new Scanner(System.in);
String s=a.nextLine();
System.out.println(s.substring(2,4));
System.out.println(s.substring(2));
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.replace("amma","Amma"));
System.out.println(s.replace('a','A'));
System.out.println(s.replaceAll("a","A"));
System.out.println(s.indexOf('m'));
System.out.println(s.lastIndexOf('m'));
System.out.println(s.charAt(5));
System.out.println(s.replaceFirst("a","A"));
}
}
