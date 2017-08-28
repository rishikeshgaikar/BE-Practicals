import java.util.*;

public class Hamcode {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of bits in Dataword: ");
		int n = sc.nextInt();
		int a[] = new int[n];

		System.out.print("Enter the Dataword: ");
		for (int i = 0 ; i < n ; i++)
			a[n - i - 1] = sc.nextInt();

		int b[] = generateCode(a);

		System.out.print("Generated code is: ");
		for (int i = 0 ; i < b.length ; i++)
			System.out.print(b[b.length - i - 1]);
		System.out.println();
	}

	static int[] generateCode(int a[]) {
		int b[];

		int i = 0, parity_count = 0 , j = 0, k = 0;
		while (i < a.length) {
			if (Math.pow(2, parity_count) == i + parity_count + 1) {
				parity_count++;
			} else {
				i++;
			}
		}

		b = new int[a.length + parity_count];

		for (i = 1 ; i <= b.length ; i++) {
			if (Math.pow(2, j) == i) {
				b[i - 1] = 2;
				j++;
			} else {
				b[k + j] = a[k++];
			}
		}
		for (i = 0 ; i < parity_count ; i++) {
			b[((int) Math.pow(2, i)) - 1] = getParity(b, i);
		}
		return b;
	}
	static int getParity(int b[], int power) {
		int parity = 0;
		for (int i = 0 ; i < b.length ; i++) {
			if (b[i] != 2) {
				int k = i + 1;
				String s = Integer.toBinaryString(k);

				int x = ((Integer.parseInt(s)) / ((int) Math.pow(10, power))) % 10;
				if (x == 1) {
					if (b[i] == 1) {
						parity = (parity + 1) % 2;
					}
				}
			}
		}
		return parity;
	}
}


//**C:\Users\rishi\Desktop\cn101>java Hamcode
Enter the number of bits in Dataword: 7
Enter the Dataword: 1 0 0 1 1 0 1
Generated code is: 10011100101

C:\Users\rishi\Desktop\cn101>**//
