package model;
import java.util.HashMap;

public class Usuario 
{
	private String nome;
    private String endereco;
    private String informacoesEmergencia;
    private HashMap<String, String> contatosEmergencia;  //(familiar, telefone)
    private static Usuario uniqueInstance;
    
    private Usuario (String nome, String endereco, String informacoesEmergencia, HashMap<String, String> contatosEmergencia) 
    {
    	this.nome = nome;
    	this.endereco = endereco;
    	this.informacoesEmergencia = informacoesEmergencia;
    	this.contatosEmergencia = contatosEmergencia;
    }
    
    public static synchronized Usuario getInstance (String nome, String endereco, String informacoesEmergencia, HashMap<String, String> contatosEmergencia)
    {
    	if (uniqueInstance == null)
            uniqueInstance = new Usuario(nome, endereco, informacoesEmergencia, contatosEmergencia);
    	
    	return uniqueInstance;
    }

    // seta o nome do usuario
    public void setNome(String nome) {
        this.nome = nome;
    }

    // seta o endereco do usuario
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // seta informacoes de emergencia do usuario
    public void setInformacoesEmergencia(String informacoesEmergencia) {
        this.informacoesEmergencia = informacoesEmergencia;
    }

    // seta os contatos de emergencia do usuario
    public void setContatosEmergencia(HashMap<String, String> contatosEmergencia) {
        this.contatosEmergencia = contatosEmergencia;
    }

    // Retorna o nome do usuário
    public String getNome() {
        return nome;
    }

    // Retorna o endereço do usuário
    public String getEndereco() {
        return endereco;
    }


    // Retorna as informações de emergência do usuário
    public String getInformacoesEmergencia() {
        return informacoesEmergencia;
    }

    // Retorna lisa de contatos de emergencia
    public HashMap<String, String> getContatosEmergencia() {
        return contatosEmergencia;
    }

}
