import java.util.*;

class Solution{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int z=cin.nextInt();

		for(int i=0;i<z;i++){
			try{
				long x=cin.nextLong();
				System.out.println(x + " can be fitted in:");
				if(x>=-128 && x<=127)System.out.println("* byte");
				if(x>=-32768 && x<=32767)System.out.println("* short");
				if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
				System.out.println("* long");
			} catch(Exception e){
				System.out.println(cin.next()+" can't be fitted anywhere.");
			}
		}
	}
}