package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite o n�mero do Funcion�rio ");
		int numero = sc.nextInt();
		System.out.println("Digite Total de Horas trabalhadas");
		double hTrab = sc.nextDouble();
		System.out.println(hTrab);
		System.out.println("Digite o Valor Hora");
		double valorHora =sc.nextDouble();
		System.out.println(valorHora);
		double salario = valorHora*hTrab;
		
		System.out.printf("N�mero: "+numero+"%nSal�rio = R$ %.2f%n ", salario );
		
		sc.close();
	}

}
/*public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int numero, horas;
    double valorHora, salario;

    numero = sc.nextInt();
    horas = sc.nextInt();
    valorHora = sc.nextDouble();

    salario = valorHora * horas;

    System.out.println("NUMBER = " + numero);
    System.out.printf("SALARY = U$ %.2f%n", salario);
	
	sc.close();
}
}*/
