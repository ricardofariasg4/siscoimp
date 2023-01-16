package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import model.ContatoMedico;

public class GerenciadorMedico 
{
	static int id=0;
	public static boolean cadastraMedico (String nome, String telefone, String endereco, String especialidade)
	{
		try 
		{
			ContatoMedico medico = new ContatoMedico(nome, telefone, endereco, especialidade);
			++id;
			
			FileWriter f = new FileWriter("/Users/ronaldbatista/ricardo/ci062/medicos/medicos_" + id + ".txt", true);
            
            f.write
            (
                ""+medico.getNome() //Duas quebras de linha para formar outro bloco 
                +"\n"+medico.getTelefone()
                +"\n"+medico.getEndereco()
                +"\n"+medico.getEspecialidade()
                +"\n"
            );
            
            f.close();
            
            return true;
		}
		
        catch (IOException e) 
        {
            System.out.println("Erro na gravação do contato médico");
            e.printStackTrace();
        }
        
        return false;
	}
	
	public static void exibeMedicos () // TODO: Erro ao mostrar varios médicos
	{
		File pasta = new File("/Users/ronaldbatista/ricardo/ci062/medicos"); 
		int contador = 0;
		
		File[] lista = pasta.listFiles();

		for (File file : lista) 
		{
		    if (file.isFile()) {
		        contador ++;
		    }
		}
		
		try 
		{
			for (int i=0; i<contador; i++)
			{
				Path path = Paths.get("/Users/ronaldbatista/ricardo/ci062/medicos/medicos_"+contador+".txt");
				List<String> linhas;
				linhas = Files.readAllLines(path);
				System.out.println("----------------------");
				System.out.println("Nome: "+linhas.get(0).toString());
				System.out.println("Telefone: "+linhas.get(1).toString());
				System.out.println("Endereço: "+linhas.get(2).toString());
				System.out.println("Especialidade: "+linhas.get(3).toString());
				System.out.println("----------------------");
			}
		}
		
		catch (Exception e)
		{
			System.out.println("Erro ao tentar exibir medicos");
			e.printStackTrace();
		}
	}
}
