package codingtest;

import java.util.Arrays;
import java.util.Scanner;

public class Test_01_31 {
	int num1 = 0, num2 = 0, num3 = 0, count = 0, num = 0, num0 = 0;


	void Input(int num1, int num2) {
		int[][] arrnum = new int[num1][num2];
		num = num1;
		num0 = num1;
		while (true) {
				for (int j = count; j < num; j++) {
					arrnum[count][j] = num3;
					System.out.println("1번");
					System.out.println(num3);
					num3++;
				}
				for (int i = count + 1; i < num; i++) {
					arrnum[i][num2 - 1 - count] = num3;
					System.out.println("2번");
					System.out.println(num3);
					num3++;
				}
				for (int j = num2 - 2 - count; j > num0 - num2 - 1; j--) {
					arrnum[num1 - 1 - count][j] = num3;
					System.out.println("3번");
					System.out.println(num3);
					num3++;
				}
				for (int i = num1 - 2 - count; i > num0 - num2; i--) {
					arrnum[i][count] = num3;
					System.out.println("4번");
					System.out.println(num3);
					num3++;
				}
				num0++;
				num--;
				count++;
				if (num3 == num1 * num2) {
					for (int i = 0; i < arrnum.length; i++) {
						for (int j = 0; j < arrnum[i].length; j++) {
							System.out.print(arrnum[i][j] + "\t");
						}
						System.out.println("");
					}
					break;
				}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test_01_31 m = new Test_01_31();
		while(true) {
			System.out.print("매트릭스 크기 입력\n행 :");
			m.num1 = sc.nextInt();
			System.out.println("");
			System.out.print("열 :");
			m.num2 = sc.nextInt();
			System.out.println("");
			m.Input(m.num1, m.num2);
			System.out.println();
			if(m.num1 != m.num2) {
				System.out.println("다시 입력하세요");
				break;
			}
			m.count =0;
			m.num3 = 0;
		}

	}
}
