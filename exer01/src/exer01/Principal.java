package exer01;

import java.util.Locale;

public class Principal {

	public static void main(String[] args) {
		String product1="computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
	    char gender = 'F';
	     
	    double price1 = 2100.0;
	    double price2 = 650.50;
	    double measure = 53.234567;
	    
	    System.out.print("Products: \n");
	    System.out.printf(" Computer which price is $%s", price1);
	    System.out.printf("\n Office desk, which price is $%.2f %n", price2);
	    System.out.printf(" Record: %d years old, code: %d  and gender: %s ", age ,code,gender);
	    System.out.printf("%n Measue with eight decimal places: %.8f", measure);
	    System.out.printf("%n Rouded (three decimal places): %.3f",measure);
	    Locale.setDefault(Locale.US);
	    System.out.printf("%n Rouded (three decimal places): %.3f",measure);
	    		
		
		

	}

}
