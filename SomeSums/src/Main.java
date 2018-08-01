import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> matList = new ArrayList<>();
		for(int i=0; i < N; i++){
			matList.add(sc.nextInt());
		}
		Collections.sort(matList, Comparator.reverseOrder());
		int diff = 0;
		for(int i = 0; i < N; i++){
			if(i % 2 ==0){
				diff += matList.get(i);
			} else {
				diff -= matList.get(i);
			}
		}
		System.out.println(diff);
		sc.close();
	}
}
