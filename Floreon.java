public class Floreon extends Eevee {
    
    private String nome = "Floreon";
    private String tipo = "Fogo";

    //Construtor
    public Floreon(){
        
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
        return "Fire Fang";
    }

    public String especial(){
        return "Flamethrower";
    }

    public String defesa(){
        return "Will-O-Wisp";
    }
}