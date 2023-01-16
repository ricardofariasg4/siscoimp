package model;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;

public class Exames extends Agendamentos{
    private String nome;
    private String resultado;

    public Exames(String nome, String data, String descricao, String resultado) {
        super(data, descricao);
        this.nome = nome;
        this.resultado = resultado != null ? resultado : null;
    }

   /* public ArrayList<String> getExameInfos(){
        //retorna um array com as informações do exame
        ArrayList<String> infos = new ArrayList<String>();
        infos.add("Nome: " + this.nome);
        infos.add("Resultado: " + this.resultado);
        infos.add("Data: " + this.data.getTime());
        infos.add("Descrição: " + this.descricao);
        infos.add("Imagens: " + this.imagens);
        infos.add("Videos: " + this.videos);
        return infos;
    }*/
    
    public String getNome() {
    	return this.nome;
    }
    
    public String getData() {
    	return this.data;
    }
    
    public String getDescricao() {
    	return this.descricao;
    }
    
    public String getResultado() {
    	return this.resultado;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public void setResultado(String resutlado) {
    	this.resultado = resultado;
    }
    

}
