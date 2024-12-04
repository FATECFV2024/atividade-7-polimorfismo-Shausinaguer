public class Glaceon extends Eevee {
    
    private String nome = "Glaceon";
    private String tipo = "Gelo";

    //Construtor
    public Glaceon(){
        
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
        return "Ice Shard";
    }

    public String especial(){
        return "Blizzard";
    }

    public String defesa(){
        return "Barrier";
    }
}
