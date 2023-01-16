package viewText;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import controller.GerenciaExames;
import controller.GerenciadorUsuario;

import java.io.*;
public class TelaExame{


			protected static void limpaTela()
			{
				for (int i = 0; i < 50; ++i) System.out.println();;
			}
			
			
			public static void telaExame()
			{
				limpaTela();
				Scanner teclado = new Scanner(System.in);
				System.out.println("Digite 1 para visualizar Exames");
				System.out.println("Digite 2 para Criar um Exames");
				System.out.println("Digite 0 para voltar ao Menu Principal");
				int opcao = teclado.nextInt();
				switch (opcao) {
					case 0:
						TelaMenu.telaMenu();
						break;
					case 1:
						telaExibeExame();
						break;
					case 2:
						criaExame();
						break;

				}
			}
			
			public static void criaExame()
			{
				limpaTela();
				Scanner teclado = new Scanner(System.in);
				System.out.println("Qual o nome do exame que irá realizar?");
				String nomeExame = teclado.nextLine();
				System.out.println("Qual a data do exame:");
				String data = teclado.nextLine();
				System.out.println("Digite uma descrição para o exame:");
				String descricao = teclado.nextLine();
				
				boolean response = GerenciaExames.CriaExame(nomeExame, data, descricao);
				if (response == true) {
					System.out.println("Exame criado com sucesso!");
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
					TelaMenu.telaMenu();
				}
				
			}
			
		
			public static void telaExibeExame()
			{
				limpaTela();
				GerenciaExames.exibeExames();
				System.out.println("");
				System.out.println("");
				System.out.println("Digite 0 para voltar ao Menu");
				Scanner teclado = new Scanner(System.in);
				int opcao = teclado.nextInt();
				if (opcao == 0)
					TelaMenu.telaMenu();
				
			}
			
	}

