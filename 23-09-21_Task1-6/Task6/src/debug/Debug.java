package debug;

public class Debug {
	//public static int smallest;
	public static void minimum(int a, int b) {
		  if (a < b) {
			  System.out.println("a is the smallest!");
		  }
		  else if(a == b) {
			  System.out.println("a and b is equal to each other!");
		  }
		  else if (b < a){
			  System.out.println("b is the smallest!");
		  }
		  else {
			  System.out.println("Something went wrong, a and b hasn't been compared");
		  }
		  /*if(smallest == 1) {
		      System.out.println("a is the smallest!");
		    }
		    else if(smallest == 2) {
		    	System.out.println("a and b is equal to each other!");
		    }
		    else if (smallest == 3) {
		    	System.out.println("b is the smallest!");
		    }
		    else {
		    	System.out.println("Something went wrong, a and b hasn't been compared");
		    }*/
	  }
	public static void main(String[] args) {
		System.out.println("1: Expected a > b");
		int a = 42;
		int b = 30;
	    minimum(a,b);
	    System.out.println("2: Expected b > a");
	    a = 3;
		b = 99;
	    minimum(a,b);
	    System.out.println("3: Expected a = b");
	    a = 50;
		b = 50;
	    minimum(a,b);
	  }
}