import java.util.Scanner;

import classes.Aluguel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Aluguel alugueis[] = new Aluguel[10];
		int n, num_quarto;
		int cont = 0;
		String nome, email;
		
		System.out.print("Quantos quartos serão alugados? ");
		n = scan.nextInt();
		
		if(n <= 0 || n > 10) {
			System.out.println("Número inválido");
		} else {
			
			while(cont < n) {
				System.out.print("\nQuarto: ");
				num_quarto = scan.nextInt();
				System.out.print("Nome do estudante: ");
				scan.nextLine();
				nome = scan.nextLine();
				System.out.print("E-mail: ");
				email = scan.nextLine();
				
				if(alugueis[num_quarto-1] == null) {
					alugueis[num_quarto-1] = new Aluguel(nome, email);
					cont++;
				}
				
			}
			
			System.out.println("\n");
			
			for(int i = 0; i < 10; i++) {
				
				if(alugueis[i] != null) {
					System.out.println("Quarto #" + (i+1) + ": " + alugueis[i].toString());
				}
				
			}
			
		}
		
		System.exit(0);
		
	}

}
