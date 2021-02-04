package codingtest;

import java.util.Arrays;

public class Generator2 {
	public static void main(String[] args) {
		String num = "";
		int Gr = 0;
		int total = 0;
		int[] arrNum = new int[4999];
		for (int i = 1; i < 5000; i++) {
			arrNum[i - 1] = i;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				for (int j2 = 0; j2 < 10; j2++) {
					for (int k = 0; k < 10; k++) {
						num = String.format("%d", i) + String.format("%d", j) + String.format("%d", j2)
								+ String.format("%d", k);
						Gr = (i + j + j2 + k) + Integer.parseInt(num);
						for (int k2 = 1; k2 < 5000; k2++) {
							if (arrNum[k2 - 1] == Gr) {
								arrNum[k2 - 1] = 0;
							}
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(arrNum));
		for (int l = 1; l < 5000; l++) {
			total += arrNum[l - 1];
		}

		System.out.println(total);
	}
}
