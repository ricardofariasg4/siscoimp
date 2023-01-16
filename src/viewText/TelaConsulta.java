package viewText;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.GerenciadorConsultas;
import controller.GerenciadorMedico;

import java.io.*;
public class TelaConsulta{

		protected static void limpaTela()
		{
			for (int i = 0; i < 50; ++i) System.out.println();;
		}
		
		
		public static void telaConsulta()
		{
			limpaTela();
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite 1 para visualizar suas consultas");
			System.out.println("Digite 2 para agendar consulta");
			System.out.println("Digite 3 para modificar uma consulta");
			System.out.println("Digite 0 para voltar ao Menu Principal");
			int opcao = teclado.nextInt();
			switch (opcao) {
				case 0:
					TelaMenu.telaMenu();
					break;
				case 1:
					telaVisualizarConsulta();
					break;
				case 2:
					telaAgendarConsulta();
					break;
				case 3:
					telaModificarConsulta();
					break;

			}
		}
	

		
		public static void telaAgendarConsulta()
		{
			limpaTela();
			Scanner teclado = new Scanner(System.in);

			System.out.println("Vamos agendar uma nova consulta");
			System.out.println("Digite o nome do médico:");
			String nomeMedico = teclado.nextLine();
			System.out.println("Digite a especialidade do medico");
			String especialidade = teclado.nextLine();
			System.out.println("Digite uma descricao sobre a consulta:");
			String descricao = teclado.nextLine();
			System.out.println("Digite a data da consulta: (DIA/MES/ANO)");
			String data = teclado.nextLine();
			System.out.println("");
			System.out.println("");
			System.out.println("Digite 0 para voltar ao Menu");
			
			GerenciadorConsultas.CriaConsulta(nomeMedico, especialidade, data, descricao);
			int opcao = teclado.nextInt();
			
			if (opcao == 0) {
				TelaMenu.telaMenu();
			}
		}
		
	
		public static void telaVisualizarConsulta ()
		{
			limpaTela();
			try {
				Scanner teclado = new Scanner(System.in);
				System.out.println("Suas Consultas");
				GerenciadorConsultas.exibeConsultas();
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
						telaConsulta();
						
				}
			}
			catch(Exception e) {
				System.out.println("Erro ao visualizar lista de consultas");
			}
			
		}
		
		public static void telaModificarConsulta ()
		{
			int campoUm = 0, campoDois = 0;
			boolean resultado=false;
			String novoDado = "";
			
			try (Scanner teclado = new Scanner(System.in))
			{
				System.out.println("Modificar Consultas");
				GerenciadorConsultas.exibeConsultas();
				
				System.out.println("Digite o número da consulta que deseja alterar:");
				campoUm = Integer.parseInt(teclado.nextLine());
				limpaTela();
				
				System.out.println("Qual campo de consulta deseja alterar?");
				System.out.println("1 - Médico");
				System.out.println("2 - Especialidade");
				System.out.println("3 - Diagnóstico");
				System.out.println("4 - Prescrição");
				System.out.println("5 - Laudo");
				System.out.println("6 - Data");
				System.out.println("7 - Descrição");
				campoDois = Integer.parseInt(teclado.nextLine());
				limpaTela();
				
				switch (campoDois) 
				{
					case 1:
						System.out.println("Digite o nome do novo medico");
						novoDado = teclado.nextLine();
						resultado = GerenciadorConsultas.editaConsulta(campoUm, campoDois, novoDado);
						break;
					
					case 2:
						limpaTela();
						System.out.println("Digite o nome da nova especialidade");
						novoDado = teclado.nextLine();
						resultado = GerenciadorConsultas.editaConsulta(campoUm, campoDois, novoDado);
						break;
					
					case 3:
						limpaTela();
						System.out.println("Digite o novo diagnóstico");
						novoDado = teclado.nextLine();
						resultado = GerenciadorConsultas.editaConsulta(campoUm, campoDois, novoDado);
						break;
					
					case 4:
						limpaTela();
						System.out.println("Digite a nova prescrição");
						novoDado = teclado.nextLine();
						resultado = GerenciadorConsultas.editaConsulta(campoUm, campoDois, novoDado);
						break;
					
					case 5:
						limpaTela();
						System.out.println("Digite o novo laudo");
						novoDado = teclado.nextLine();
						resultado = GerenciadorConsultas.editaConsulta(campoUm, campoDois, novoDado);
					break;
						
					case 6:
						limpaTela();
						System.out.println("Digite a nova data");
						novoDado = teclado.nextLine();
						resultado = GerenciadorConsultas.editaConsulta(campoUm, campoDois, novoDado);
					break;
					
					case 7:
						limpaTela();
						System.out.println("Digite a nova descrição");
						novoDado = teclado.nextLine();
						resultado = GerenciadorConsultas.editaConsulta(campoUm, campoDois, novoDado);
					break;
				}
				
				if (resultado==true)
					System.out.println("Consulta alterada com sucesso");
				else
					System.out.println("Erro ao alterar consulta");
				
				try { Thread.sleep (2000); } catch (InterruptedException ex) {}
				TelaMenu.telaMenu();
			}
			
			catch (Exception e)
			{
				System.out.println("Erro de entrada do teclado");
			}
		}
}	

