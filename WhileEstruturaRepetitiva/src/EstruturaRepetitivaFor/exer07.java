package EstruturaRepetitivaFor;

import java.util.Scanner;

public class exer07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Digite um valor");
         int n=sc.nextInt();
        
         for(int i=1; i<n;i++) {
        	 int linha=i;
        	 int quad=i*i;
        	 int cubo=i*i*i;
        	
        	 System.out.printf("Linha: %d Quadrado: %d Valor ao Cubo: %d%n",linha,quad,cubo);
        	 
         }
         sc.close();
	}
    
}

	