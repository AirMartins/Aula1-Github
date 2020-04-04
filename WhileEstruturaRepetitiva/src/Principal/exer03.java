package Principal;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
				
		
		
        System.out.println("1 - Álcool");
        System.out.println("2 - Gaslina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Fim");
          int escolha=sc.nextInt();
          while (escolha>1 & escolha>4){
           System.out.println("Escolha inválida!!! Digite novamente");
               escolha = sc.nextInt();
   }
   sc.close();         
 }

}


