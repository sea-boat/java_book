package com.java.keyword;

public class NullTest4 {
	int a;
	int[] b;

	void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		NullTest4 nt = null;
		nt.test();// NullPointerException“ž≥£
		System.out.println(nt.a);// NullPointerException“ž≥£
		nt = new NullTest4();
		int value = nt.b[0];// NullPointerException“ž≥£
		int length = nt.b.length;// NullPointerException“ž≥£
	}
}
