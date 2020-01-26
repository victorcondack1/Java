import java.util.Scanner;
public class multiplos1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o primeiro valor");
		int A = sc.nextInt();
		System.out.println("Insira o segundo valor");
		int B = sc.nextInt();		

		if (A % B == 0 || B % A == 0 ) {
		System.out.println("São Multiplos");
		}
		else
		System.out.println("Não são Múltiplos");
		
		}
	}


