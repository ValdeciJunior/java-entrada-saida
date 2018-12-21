package principal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Scanner2 {

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(new FileReader("/home/valdeci/eclipse-workspace/java-entrada-saida/src/principal/numeros.txt"));
		double soma = 0;
		String valor;
		while (entrada.hasNext()) {
			valor = entrada.next();
			soma = soma + Double.parseDouble(valor);
		}
		entrada.close();
		JOptionPane.showMessageDialog(null, "A soma dos valor é: "+soma);
	}

}
