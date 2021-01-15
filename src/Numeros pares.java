import java.util.Scanner;


public class Main {

    public static void main(String[] args)  {
      int x;
      Scanner input = new Scanner(System.in);
      System.out.println("Insira Numero: ");
      x = input.nextInt();
      for ( int i = 1; i <= x; i++) {
            if (i % 2 == 0 ){
              System.out.println(i);
              i++;
            } 
        }
    }

}