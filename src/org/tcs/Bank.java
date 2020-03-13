package org.tcs;

public class Bank  {
	public void fixed() {
	System.out.println("fixed-200");
	}
	public void saving() {
	System.out.println("saving-300");
	}
public static void main(String[] args) {
	Bank b =new Bank();
	b.fixed();
	b.saving();
}
}
