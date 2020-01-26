import java.util.Scanner;

public class java {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o  valor");
	
		int valor = sc.nextInt();
        if (valor <=  0) {
        System.out.println("Negativo");	
        } 
        else
        	System.out.println("Positivo");
        	
		sc.close();
	}

}
