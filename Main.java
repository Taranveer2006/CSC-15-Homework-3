// Taranveer Singh

package Main;

public class Main{
	public static void main(String[] args){
	int i = 0;
	final int max = 10;
	
	while (i < max){
		
		System.out.println(Integer.toString(i));
		i++;
		
	}
	// The white loop keeps adding 1 to "i" until it reaches satisfies the while condition.
	i = 0;
	
	do{
		
		System.out.println(Integer.toString(i));
		i++;
		
	}while(i < max);
	{
	// The do/while loop keeps adding 1 to "i" until it doesn't satisfy the while loop.
	for(i = 0; i < max; i++){
		
		System.out.println(Integer.toString(i));
	}
	// The for loop adds 1 to 0 until "i" becomes the biggest number less then 10.
}
	
}
}

