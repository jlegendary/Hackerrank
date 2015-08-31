import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int z=cin.nextInt();
        for(;z>0;z--){
        	int a=cin.nextInt(), b=cin.nextInt(), n=cin.nextInt();
        	for(int i=0;i<n;i++){
        		System.out.print(a+b*((2<<i)-1));
        		System.out.print(i<n-1?" ":"\n");
        	}
        }
    }
}