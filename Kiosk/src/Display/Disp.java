package Display;

import util.Cw;

public class Disp {
	String x = "x";
	final static String DOT = "★";
	final static int DOT_COUNT = 48;
	public static void line() {
		for(int i=0;i<DOT_COUNT;i=i+1) {
			Cw.w(DOT);
		}
		Cw.wn();
	}
	
	public static void dot(int n) {
		for(int i=0;i<n;i++) {
			Cw.w(DOT);
		}
	}
	
	public static void title() {
		line();
		dot(22);
		Cw.w("PC방");
		dot(23);
		Cw.wn();
		line();
	}
	
}
