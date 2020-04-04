package principal;

import java.util.Locale;
import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite um número: ");
		int num=sc.nextInt();
		if (num%2==0){
		    System.out.println("Número Digitado é Par: ");
		} 
		      else{
		             System.out.println("Número Digitado é Impar ");
		     }
		sc.close();
		
		

	}

}
