import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sumDigit = 0;
		for(int i = 1; i <= n; i++){
			int digit = 0;
			int j = i;
			while (j > 0){
				digit += j % 10;
				j /= 10;
			}
			if(digit >= a && digit <= b){
				sumDigit += i;
			}
		}
		System.out.println(sumDigit);
		sc.close();
	}
}
