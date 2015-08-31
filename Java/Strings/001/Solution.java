import java.util.*;

class Solution{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		String z=cin.next();

		ArrayList<String>newList=new ArrayList<String>();
		int i=cin.nextInt();
		for(int j=0; j<=z.length()-i; j++){
			newList.add(z.substring(j,j+i));
		}

		Collections.sort(newList);
		System.out.println(newList.get(0));
		System.out.println(newList.get(newList.size()-1));
	}

}