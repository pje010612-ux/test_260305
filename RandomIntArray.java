package question07;

import java.util.Random;

public class RandomIntArray {
	public static void main(String[] args) {
		Random random = new Random();
		int sum = 0;
		int array[][] = new int[3][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
				sum+=array[i][j];
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("합은 "+sum);
	}
}
