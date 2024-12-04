public class Sylveon extends Eevee {
    
    private String nome = "Sylveo";
    private String tipo = "Fada";

    //Construtor
    public Sylveon(){
        
    }

    //Getters e Setters
    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //Metodos
    public String ataque(){
        return "Disarming Voice";
    }

    public String especial(){
        return "Moonblast";
    }

    public String defesa(){
        return "Calm Mind";
    }
}
