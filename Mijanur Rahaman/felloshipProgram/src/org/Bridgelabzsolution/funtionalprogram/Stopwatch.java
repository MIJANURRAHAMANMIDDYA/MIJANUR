package org.Bridgelabzsolution.funtionalprogram;

public class Stopwatch {
	public final long start;
	 public Stopwatch() {
	        start = System.currentTimeMillis();
	    } 
	 public double elapsedTime() {
	        long now = System.currentTimeMillis();
	        return (now - start) / 1000.0;
	    }

	public static void main(String[] args) {
		
}

}
