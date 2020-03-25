package TDD_JUNIT;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1=scan.next();
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if( i==0 && s1.charAt(i)!='A') {
				s2+=s1.charAt(i);
			}
			if(i==1 && s1.charAt(i)!='A') {
				s2+=s1.charAt(i);
			}
			if( i!=0 && i!=1)
			{
				s2+=s1.charAt(i);
			}
		}
		
		if(s1.charAt(0)!='A' && s1.charAt(1)!='A') {
				s2=s1;
				//System.out.println('+'+s2);
		}
		System.out.println("Finally !! The String is :"+s2);
		
			
		}
	}


