public class Main {
	public static void main(String args[]) {

		int val = 5;
		for (int i = 1; i <= val; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		// System.out.println();

		for (int i = val - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= val; i++) {
			for (int j = val; j >= 1; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}

		// System.out.println();

		for (int i = val - 1; i >= 1; i--) {
			for (int j = val; j >= 1; j--) {
				if (j <= i) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= val; i++) {
			for (int j = val; j >= 1; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print(j);
				}
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		// System.out.println();

		for (int i = val - 1; i >= 1; i--) {
			for (int j = val; j >= 1; j--) {
				if (j <= i) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
