import java.util.Scanner;

public class reversingstring {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		String answer="";
		String []strarr=new String[1000];
		char[] stringarray=input1.toCharArray();
		int i=0;
		for(char c:stringarray) {
			
			if(c == ' ' )
			{
				strarr[i]=answer;
				i++;
				
				answer="";
				continue;
			}
			answer=answer+c;
			
			
		}
		
		strarr[i]=answer;
		
		int count=i;
		
		for(int j=count;j>=0;j--) {
			if(j==count) {
				System.out.print(strarr[j]);
				continue;
			}
			System.out.print(" "+strarr[j]);
			
			
		}
		
	}

}
