package model;

public class ContatoMedico {
    private String nome;
    private String telefone;
    private String endereco;
    private String especialidade;
    private int id=0;

    public ContatoMedico(String nome, String telefone, String endereco, String especialidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.especialidade = especialidade;
        this.id = ++id;
  
    }
    
    public int getid() {
    	return this.id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public String getEspecialidade () {
    	return especialidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void setEspecialidade (String especialidade) {
    	this.especialidade = especialidade;
    }
    
}
