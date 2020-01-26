import java.util.Scanner;
import java.util.Locale;
public class scan {

	public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 
Scanner sc = new Scanner(System.in);
System.out.println("Insira a largura = ");

 double largura = sc.nextDouble();
 System.out.println("Insira comprimento = ");

 double comprimento = sc.nextDouble();
 System.out.println("Insira metro quadrado = ");

 double metroquadrado = sc.nextDouble();
 
 double area = largura * comprimento;
 double preco = area * metroquadrado;
 

 System.out.printf("AREA = %.2f%n", area);
 System.out.printf("Preço = %.2f%n", preco);

 sc.close();



	
}
}
