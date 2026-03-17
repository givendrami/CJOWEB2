import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// instanciar um objeto da classe Scanner
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, soma;
		System.out.println("Digite um numero inteiro: ");
		numero1 = teclado.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		numero2 = teclado.nextInt();
		soma = numero1 + numero2;
		System.out.println("Soma = " + soma);
		teclado.close();
		}

}
