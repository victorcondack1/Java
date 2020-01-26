import java.util.Scanner;

public class parimpar {

	public static void main(String[] args) {
	      
		Scanner sc = new Scanner(System.in);
		int N;
		System.out.println("Insira o valor");
		N = sc.nextInt();
      
		if (N % 2 == 0) {
			System.out.println("Par");
		} else 
			System.out.println("Impar");
	}

}
