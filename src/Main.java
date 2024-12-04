import java.util.Scanner;

import classes.Aluguel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Aluguel alugueis[] = new Aluguel[10];
		int n;
		
		System.out.print("Digite o número de estudante que vão alugar quartos: ");
		n = scan.nextInt();
		
		if(n <= 0 || n > 10) {
			System.out.println("Número inválido");
		} else {
			
			
			
		}
		
		System.exit(0);
		
	}

}
