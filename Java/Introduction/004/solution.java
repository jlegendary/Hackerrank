import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner cin=new Scanner(System.in);
            System.out.println("================================");
            for(;cin.hasNext();)
            {
                String s=cin.next();
                int x=cin.nextInt();
                System.out.printf("%-15s%03d\n",s,x);
            }
            System.out.println("================================");

    }
}