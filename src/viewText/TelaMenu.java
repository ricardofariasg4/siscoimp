package viewText;

import java.util.HashMap;
import java.util.Scanner;

import controller.GerenciadorUsuario;

public class TelaMenu {
	
	protected static void limpaTela()
	{
		for (int i = 0; i < 50; ++i) System.out.println();;
	}
	

	public static void telaBoasVindas()
	{
		Scanner teclado = new Scanner(System.in);
		HashMap<String, String> contatoEmergencia = new HashMap<String, String>();
		System.out.println("Seja bem-vindo, cadastre seu usuário. ");
		System.out.println("Qual seu nome?");
		String nome = teclado.nextLine();
		System.out.println("Digite seu endereço:");
		String endereco = teclado.nextLine();
		System.out.println("Possui algum informação de emergencia (alergias)?");
		String informacaoEmergencia = teclado.nextLine();
		System.out.println("Digite um contatos de emergencia");
		System.out.println("nome do familiar:");
		String familiarNome = teclado.nextLine();
		System.out.println("Telefone de contato do familiar");
		String familiarTelefone = teclado.nextLine();
		contatoEmergencia.put(familiarNome, familiarTelefone);
		
		boolean response = GerenciadorUsuario.CriaUsuario(nome, endereco, informacaoEmergencia, contatoEmergencia);
		if (response == true) {
			System.out.println("Usuário criado com sucesso!");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			telaMenu();
		}
		else {
			System.out.println("Falha ao criar usuário :/");
		}
	}
	
	
	public static void telaMenu()
	{
		limpaTela();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha uma opção:");
		System.out.println("(1) - Meus dados pessoais");
		System.out.println("(2) - Contatos médicos");
		System.out.println("(3) - Consultas");
		System.out.println("(4) - Exames");
		System.out.println("(5) - Notificações");
		int opcao = teclado.nextInt();
		switch (opcao) {
			case 1:
				TelaCadastro.telaDadosPessoais(); // CADASTRAR, EXIBIR, ALTERAR - TESTADO COM SUCESSO
				break;
			case 2:
				TelaContatosMedicos.telaContatosMedicos(); // CADASTRAR E EXIBIR - TESTADO COM SUCESSO
				break;
			case 3:
				TelaConsulta.telaConsulta(); // CADASTRAR E EXIBIR - TESTADO COM SUCESSO  ---- TODO: ALTERAR CONSULTA
				break;
			case 4:
				TelaExame.telaExame(); // CADASTRAR E EXIBIR - TESTADO COM SUCESSO  ---- TODO: ALTERAR EXAME
				break;
			case 5:
				TelaNotificacoes.notificacoes();
			default:
				System.out.println("Opcao inválida");
		}
	}
	
}
