import java.util.Scanner;
import java.lang.Math;

public class philipsfuckedup {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int []a=new int[1000];
		
		int q=input1;
		int r=0;
		int sum=0;
		int i=0;
		int count1=0;
		while(q>0) {
			r=q%10;
			q=q/10;
			a[i]=r;
			i++;
			
			count1++;
		}
		
		for(i=0;i<count1;i++) {
			sum+=Math.pow(a[i], count1);
			
			
		}
		System.out.println(sum);
		if(sum==input1) {
			
			System.out.println("Yes");
		}
		else {
			
			System.out.println("No");
		}
		
		
		
	}
	
	
}
