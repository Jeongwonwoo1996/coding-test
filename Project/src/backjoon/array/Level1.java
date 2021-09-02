package backjoon.array;

import java.util.Scanner;

/* 문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

예제 입력 1 
5
20 10 35 30 7

예제 출력 1 
7 35
 */
public class Level1 {

	public void main() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		int[] values = new int[count];
		for (int i = 0; i < count; i++) {
			values[i] = sc.nextInt();
		}
		
		int min = 10000000;
		int max = -10000000;
		for (int i = 0; i < count; i++) {
			if (values[i] < min)
				min = values[i];
			
			if (values[i] > max)
				max = values[i];
		}
		
		System.out.printf("%d %d", min, max);
		sc.close();
	}
}
