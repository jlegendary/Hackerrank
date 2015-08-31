import java.util.*;

class Solution{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		
		String[] z=cin.nextLine().trim().split("[ !,?\\._'@]+",0);
		if(z.length==1 && z[0].equals("")){
			System.out.println(0);
		} else {
			System.out.println(z.length);
			for(String s:z){
				System.out.println(s);
			}
		}
	}
}