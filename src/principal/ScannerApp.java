package principal;

import java.util.Formatter;
import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Formatter saida = new Formatter(System.out);

		System.out.println("Digite a nota 1");
		float n1 = entrada.nextFloat();
		
		System.out.println("Digite a nota 2");
		float n2 = entrada.nextFloat();
		
		System.out.println("Digite a nota 3");
		float n3 = entrada.nextFloat();

		System.out.println("Digite a nota 4");
		float n4 = entrada.nextFloat();
		
		float media = (n1+n2+n3+n4)/4;
		
		saida.format("Minha média é %.2f", media);
		entrada.close();
		saida.close();
	}

}
