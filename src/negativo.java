import java.util.Scanner;
public class negativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Insira o n�mero aqui: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		if (numero < 0 ) {
			System.out.println("N�mero  negativo");
		}
			else {
				System.out.println("N�mero n�o negativo");
		}
		sc.close();
		}
		
		

	}

