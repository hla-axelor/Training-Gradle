package com.hardik.si;
class Simple{
	public void calSi(int p, int r){
		int ans = (p*r)/100;
		System.out.println("the simple intrest is"+ans);
	}
	public static void main(String [] args){
		Simple s = new Simple ();
		s.calSi(100,5);
		s.calSi(200,8);
		s.calSi(2065,8);
	}
}
