import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//instanciar um objeto da classe Random
		Random geradorDeNumeros = new Random();
		int face1, face2, soma, tentativas, opcao, aposta;
		boolean acertou;
		do {
			face1 = geradorDeNumeros.nexInt(6) + 1;
			face2 = geradorDeNumeros.nexInt(6) + 1;
			soma = face1 + face2;
			tentativas = 3;
			System.out.println("Face 1:" + face1 + " - Face 2:" + " - Soma:" + soma);
			acertou = false;
			while(!acertou && tentativas > 0) {
				tentativas--;
				aposta = Integer.parseInt(JOptionPane.showInputDialog("Digite sua aposta"));
				if(aposta == soma) {
					acertou = true;
				}else {
					JOptionPane.showMessageDialog(null, "Voce errou!");
				}
			}
			if(acertou) {
				JOptionPane.showMessageDialog(null, "Parabens, Voce acertou");
			}else {
				JOptionPane.showMessageDialog(null, "Jogo encerrado!");
			}
			opcao = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?");
				
		}while(opcao == 0);
	}

}
