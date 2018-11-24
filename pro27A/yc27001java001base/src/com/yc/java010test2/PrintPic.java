package com.yc.java010test2;

public class PrintPic {
	char[] ct = { '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C',
			'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
			'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		if (n < 2 || n > 35) {
			this.n = 15;
		} else {
			this.n = n;
		}
	}

	public PrintPic() {
		this(13);
	}

	public PrintPic(int n) {
		setN(n);
	}

	public void printPic() {
		printTop(n);
		printDown(n);
	}

	public void printPic(int n) {
		printTop(n);
		printDown(n);
	}

	public void printTop(int n) {
		char c;
		for (int i = 1; i <= n; i++) {
			// c = i > 9 ? (char) ((i - 10) + 'A') : (char) ('0' + i);
			c = ct[i - 1];
			printLine(n - i, 2 * i - 1, c);
		}
	}

	public void printDown(int n) {
		char c;
		for (int i = n - 1; i > 0; i--) {
			c = i > 9 ? (char) ((i - 10) + 'A') : (char) ('0' + i);
			printLine(n - i, 2 * i - 1, c);
		}
	}

	public void printLine(int sn, int cn, char c) {
		printChar(sn, ' ');
		printChar(cn, c);
		System.out.println();
	}

	public void printChar(int n, char c) {
		for (int i = 0; i < n; i++) {
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		PrintPic pp = new PrintPic(25);
		// pp.printChar(5, '*');
		// pp.printLine(15, 3, '%');
		// pp.printTop(19);
		// pp.printDown(12);
		// pp.printPic(15);
		pp.printPic();
	}
}
