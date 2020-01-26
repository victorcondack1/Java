import java.util.Scanner;
import java.util.Locale;
public class treino{
	
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("insira a base: ");
	double raio = sc.nextDouble();
	double pi1 = 3.14159;
	double pi = (double) Math.pow ( 3, pi1);
	double area = raio * pi;	
sc.close();
Locale.setDefault(Locale.US);

System.out.printf("Seu valor é: %.4f%n ", area  );
}
}
