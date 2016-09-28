import java.util.Scanner;

public class A3 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int length = Integer.parseInt(scan.nextLine());
		int[] M = new int[length +1];
		int[] cache = new int[length * 2 + 2];
		
		cache[0] = 0;
		cache[1] = 0;
		
		for (int i = 2 ; i < cache.length; i = i+2){
			
			String s = scan.nextLine();
			String[] pair = s.split("\\s+");
		
			cache[i] = Integer.parseInt(pair[0]);
			cache[i + 1] = Integer.parseInt(pair[1]);
			
		}
		
		M[0] = 0;
		M[1] = Math.max(cache[2], cache[3]);
		
		for ( int i = 2 ; i < M.length; i++){
			M[i] = Math.max( M[i - 1] + cache[i * 2] , M[i - 2] + cache[i * 2 + 1]);
		}
		
		System.out.println(M[length]);
	}
}
