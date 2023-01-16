package viewText;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.GerenciadorMedico;

public class TelaContatosMedicos 
{
	protected static void limpaTela()
	{
		for (int i = 0; i < 50; ++i) System.out.println();;
	}
	
	public static void telaContatosMedicos () 
	{
		limpaTela();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 1 para visualizar seus contatos medicos");
		System.out.println("Digite 2 para criar um novo contato");
		/*System.out.println("Digite 3 para modificar um contato existente");
		System.out.println("Digite 4 para excluir um contato existente");*/
		System.out.println("Digite 0 para voltar ao Menu Principal");
		
		int opcao = teclado.nextInt();
		
		switch (opcao) {
			case 0:
				TelaMenu.telaMenu();
				break;
			case 1:
				telaVisualizarContatosMedicos();
				break;
			case 2:
				telaCriarContatoMedico();
				break;
				
			default:
				System.out.println("Opção inválida");
				break;
			/*case 3:
				telaModificarContatoMedico();
				break;
			case 4:
				telaExcluirContatoMedico();
				break;*/
		}
	}
	
	
	public static void telaVisualizarContatosMedicos()
	{
		limpaTela();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seus contatos medicos");
		GerenciadorMedico.exibeMedicos();
		System.out.println("");
		System.out.println("");
		System.out.println("Digite 1 para voltar a tela anterior");
		System.out.println("Digite 0 para voltar ao Menu");
		
		int opcao = teclado.nextInt();
		switch (opcao) {
			case 0:
				TelaMenu.telaMenu();
				break;
			case 1:
				telaContatosMedicos();
				
		}
	}
	
	public static void telaCriarContatoMedico()
	{
		limpaTela();
		Scanner teclado = new Scanner(System.in);

		System.out.println("Vamos criar um novo Contato Medico!");
		System.out.println("Qual o nome do seu médico?");
		String nomeMedico = teclado.nextLine();
		System.out.println("Digite o telefone do médico:");
		String telefone = teclado.nextLine();
		System.out.println("Digite o endereco do médico:");
		String endereco = teclado.nextLine();
		System.out.println("Qual a especialidade do médico?");
		String especialidade = teclado.nextLine();
		int id = 0;
		GerenciadorMedico.cadastraMedico(nomeMedico, telefone, endereco, especialidade);
		
		System.out.println("Digite 0 para voltar ao Menu");
		int opcao = teclado.nextInt();
		
		if (opcao == 0) {
			TelaMenu.telaMenu();
		}
	}
	
	/*
	public static void telaModificarContatoMedico()
	{
		limpaTela();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha qual campo deseja alterar");
		System.out.println("(1) - Nome");
		System.out.println("(2) - Telefone");
		System.out.println("(3) - Endereco");
		System.out.println("(4) - Especialidade");
		int opcao = teclado.nextInt();
		switch (opcao)
		{
			case 1:
				System.out.println("Escolha o novo nome do usuario:");
				String novoNome = teclado.nextLine();
				// TODO: Criar método para alterar Nome
				break;
			case 2:
				System.out.println("Digite um novo telefone:");
				String telefone = teclado.nextLine();
				// TODO: Criar método para alterar telefone
				break;
			case 3:
				System.out.println("Digite um novo endereco:");
				String endereco = teclado.nextLine();
				// TODO: Criar método para alterar endereco 
				break;
			case 4:
				System.out.println("Digite a nova especialidade");
				String especialidade = teclado.nextLine();
				// TODO: Criar método para alterar especialidade
				break;
		}
		System.out.println("Alterações concluidas!");
		System.out.println("Digite 0 para voltar ao Menu");
		int opt = teclado.nextInt();
		if (opt == 0)
			TelaMenu.telaMenu();
	}
	
	public static void telaExcluirContatoMedico()
	{
		limpaTela();
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> medico = new ArrayList<String>();
		ArrayList<String> especialidade = new ArrayList<String>();
		
		List<String>data = GerenciadorMedico.exibeMedicos();
		int quantidadeContatos = data.size(); 
		System.out.println("Seus contatos medicos");
		for (int i = 0; i < quantidadeContatos-3; i++) {
			System.out.println("----------------");
			System.out.println("Nome: " + data.get(i).toString());
			medico.add(data.get(i).toString());
			System.out.println("telefone: " + data.get(i+1).toString());
			System.out.println("endereco: " + data.get(i+2).toString());
			System.out.println("especialidade: " + data.get(i+3).toString());
			especialidade.add(data.get(i+3).toString());
			System.out.println("----------------");
		}
		System.out.println("Escolha um contato médico para excluir:");
		for (int i = 0; i < quantidadeContatos-3; i++) {
			System.out.println("Digite " + i + " Para excluir - " + medico.get(i) + " - Especialista em: " + especialidade );
		}
		
		int opcao = teclado.nextInt();
		//metodo para excluir um contato medico selecionado
		int resposta = 0; // deve ser o return do metodo de excluir
				
		if (resposta == 0)
			System.out.println("Contato excluido com sucesso!");
		else
			System.out.println("Erro ao excluir contato médico");
	}*/
}
