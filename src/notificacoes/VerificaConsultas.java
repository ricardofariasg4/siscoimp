package notificacoes;

import java.util.ArrayList;
import java.util.TimerTask;

import controller.GerenciadorConsultas;

public class VerificaConsultas extends TimerTask{
	
	 public void VerificaConsultas(){
	     //constructor 
	   }

	   @Override
	   public void run() {
		   ArrayList<String> array = GerenciadorConsultas.datasConsultas();
			String hoje = "16";
			String mesAtual = "09";
			for (int i = 0; i < array.size(); i++)
			{
				//System.out.println("----");
				String[] data = array.get(i).split(":", 3);
				System.out.println(array.get(i));
				String[] arrayData = data[2].split("-", 3);
				String dia = arrayData[0];
				String mes = arrayData[1];
				
				if (dia.equals(hoje) && mes.equals(mesAtual) )
					System.out.println("Você possui uma consulta para hoje. O ID dá consulta é " + i+1);
			}
	   }
}
