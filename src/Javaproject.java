import java.util.Scanner;
public class Javaproject {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Insira a hora inicial ");
	int horainicial = sc.nextInt();
	System.out.println("Insira a hora final");
	int horafinal = sc.nextInt();
	int resultado;
	if (horainicial < horafinal ) {
		resultado = (horainicial + horafinal); }
	else
		resultado = (24 - horainicial + horafinal); 
	System.out.println("O JOGO DUROU " + resultado + "HORA(S)" );
	}

	}

	

