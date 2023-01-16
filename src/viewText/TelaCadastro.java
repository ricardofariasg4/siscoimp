package viewText;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import controller.*;
public class TelaCadastro {
	
	protected static void limpaTela()
	{
		for (int i = 0; i < 50; ++i) System.out.println();
	}
	

	public static void telaDadosPessoais() 
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Seus dados pessoais");
		System.out.println("--------------------");
		System.out.println("Nome: " + GerenciadorUsuario.retornaDado(1));
		System.out.println("Endereço: " + GerenciadorUsuario.retornaDado(2));
		System.out.println("Informações de emergencia: " + GerenciadorUsuario.retornaDado(3));
		System.out.println("Nome do contato de emergencia: " + GerenciadorUsuario.retornaDado(4));
		System.out.println("Telefone do contato de emergencia: " + GerenciadorUsuario.retornaDado(5));
		System.out.println("--------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("Digite 1 para alterar seus dados");
		System.out.println("Digite 0 para voltar ao Menu");
		int opcao = teclado.nextInt();
		switch (opcao) {
			case 1:
				telaAlterarDadosPessoais();
			case 0:
				TelaMenu.telaMenu();
		}

	}
	
	public static void telaAlterarDadosPessoais()
	{
		limpaTela();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha qual campo deseja alterar:");
		System.out.println("(1) - Nome");
		System.out.println("(2) - Endereço");
		System.out.println("(3) - Informações de emergencia");
		System.out.println("(4) - Contato de emergencia");
		System.out.println("");
		System.out.println("");
		System.out.println("Digite 0 para voltar ao Menu");
		int opcao = teclado.nextInt();
		switch (opcao)
		{
			case 0:
				TelaMenu.telaMenu();
			case 1:
				System.out.println("Escolha o novo nome do usuario");
				String novoNome = teclado.next();
				GerenciadorUsuario.editaUsuario(1, novoNome, null);
				break;
			case 2:
				System.out.println("Digite seu novo endereço:");
				String novoEndereco = teclado.next();
				GerenciadorUsuario.editaUsuario(2, novoEndereco, null);
				break;
			case 3:
				System.out.println("Adicione novas informações de emergencia");
				String novoInformacoesEmergencia = teclado.next();
				GerenciadorUsuario.editaUsuario(3, novoInformacoesEmergencia, null);
				break;
			case 4:
				System.out.println("Digite o nome do seu contato de emergencia");
				String novoNomeConatoEmergencia = teclado.next();
				String novoTelefoneContatoEmergencia = teclado.next();
				GerenciadorUsuario.editaUsuario(4, novoNomeConatoEmergencia, novoTelefoneContatoEmergencia);
				break;
		}
		System.out.println("Alterações concluidas!");
		//try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		telaDadosPessoais();// TODO: Está dando erro nesse redirecionamento por algum motivo
	}
	
}
