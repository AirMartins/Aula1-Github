package EstruturaRepetitivaFor;

import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Digite um valor");
	    int n=sc.nextInt();
	    int in=0;
	    int out=0;
	    for (int i=1;i<=n; i++) {
	         System.out.println("digite o "+i+" valor do Intervalo");
	        int x=sc.nextInt();
	    	if (x>=10 && x<=20) {
	    		in=in+1;
	    		
	    	}
	    	else  {
	    		out=out+1;
	    	}
	    }
		System.out.println("IN: "+in+"\n OUT: "+out);
		
		
      sc.close();
	}

}
