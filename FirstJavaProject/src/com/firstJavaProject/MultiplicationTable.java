package com.firstJavaProject;

public class MultiplicationTable {
	void printTable() {
		printTable(5);
//		for (int i = 1; i <= 10; i++) {
//			System.out.printf("%d*%d=%d", i, 5, i * 5).println();
//		}
	}

	void printTable(int n) {
		printTable(n, 1, 10);
//	for(int i=1;i<=10;i++){
//		System.out.printf("%d*%d=%d",i,n,i*n).println();
//	}

	}

	void printTable(int n, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d*%d=%d", i, n, i * n).println();
		}
	}
}
