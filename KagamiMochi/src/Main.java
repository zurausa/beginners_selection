import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> matList = new ArrayList<>();
		for(int i=0; i < N; i++){
			int mat = sc.nextInt();
			if(!matList.contains(mat)){
				matList.add(mat);
			}
		}
		System.out.println(matList.size());
		sc.close();
	}
}
