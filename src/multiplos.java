import java.util.Scanner;
public class multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira A");
		
		int A = sc.nextInt();
		
		System.out.println("Insira B");
		
		int B = sc.nextInt();
		
	    
		if (A % B == 0 || B % A == 0) {
	
		System.out.println("S�o multiplos");
		}
		else
	System.out.println("N�os S�o Multiplos");
	
	
	sc.close();
	                            }
	
	
}



