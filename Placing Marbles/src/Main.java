import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(Integer.toString(sc.nextInt()).replace("0", "").length());
		sc.close();
	}
}