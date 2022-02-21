import java.util.*;
public class UserInputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] =new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0; i<a.length; i++)
			a[i]=sc.nextInt();
		
		for(int i=0; i<a.length; i++)
			System.out.println("a["+i+"]="+a[i]); 
		
		
	}

}
