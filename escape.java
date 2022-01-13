import java.util.Scanner;
public class escape {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int a=0,b=0,c=0;
		int[]ans=new int[num];
		
		for (int i = 0;i<num; i++) {
			a=in.nextInt();
			b=in.nextInt();
			c=in.nextInt();
			ans[i]=(int)(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3));
			
		}
		for (int i = 0;i<ans.length; i++) {
			System.out.println(ans[i]);
		}
		
	}
	
}
