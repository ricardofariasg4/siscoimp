package model;

import java.util.ArrayList;
import java.util.Calendar; //https://www.devmedia.com.br/trabalhando-com-as-classes-date-calendar-e-simpledateformat-em-java/27401
import java.util.Date;
import java.text.DateFormat;

public class Agendamentos {
    protected String data;
    protected String descricao;

    public Agendamentos(String data, String descricao) {
        this.data = data;
        this.descricao = descricao; 
    }

    public ArrayList<String> getAgendamentoInfos(){
        //retorna um array com as informações do agendamento
        ArrayList<String> infos = new ArrayList<String>();
        //infos.add("Data: " + data.getTime());
        infos.add("Descrição: " + descricao);
        return infos;
    }
    
    public void setData (String data) {
    	this.data = data;
    }
    
    public void setDescricao(String descricao) {
    	this.descricao = descricao;
    }
    
  
}
