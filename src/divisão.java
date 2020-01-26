import java.util.Scanner;

public class divisão {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Insira a hora inicial");
	int horainicial = sc.nextInt();
    
	System.out.println("Insira a hora final");
	int horafinal = sc.nextInt();
	
	int duracao;
	
	if (horafinal > horainicial) { 
		duracao = horafinal - horainicial;
	}
	else duracao = 24 - horainicial + horafinal;
	System.out.println("O JOGO DUROU " + duracao + "Hora(s)");
	
	sc.close();
	
	}
		
	}


