package notificacoes;

import java.util.ArrayList;
import java.util.Timer;

import controller.GerenciadorConsultas;

public class TimerNotify {

	public static void taskNotify() {
		ArrayList<String> array = GerenciadorConsultas.datasConsultas();
		String hoje = "16";
		String mesAtual = "09";
		if (array.size() >= 1) {
			for (int i = 0; i < array.size(); i++)
			{
				String[] data = array.get(i).split(":", 3);
				
				String[] arrayData = data[2].split("/", 3);
				String dia = arrayData[0];
				String mes = arrayData[1];
				
				if (dia.equals(hoje) && mes.equals(mesAtual) )
					System.out.println("Você possui uma consulta para hoje. O ID dá consulta é " + i+1);
			}
		}else
			System.out.println("Não existem notificações no momento.");
	}
	
	
}
