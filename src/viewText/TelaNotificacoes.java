package viewText;

import java.util.Scanner;

import notificacoes.TimerNotify;

public class TelaNotificacoes {
	
	protected static void limpaTela()
	{
		for (int i = 0; i < 50; ++i) System.out.println();;
	}
	
	public static void notificacoes() {
		limpaTela();
		Scanner teclado = new Scanner(System.in);
		TimerNotify.taskNotify();
		System.out.println("Digite 0 para voltar ao Menu");
		int opcao = teclado.nextInt();
		
		if (opcao == 0)
			TelaMenu.telaMenu();
		
	}
}
