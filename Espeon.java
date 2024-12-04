public class Espeon extends Eevee {
    
    private String nome = "Espeon";
    private String tipo = "Psiquico";

    //Construtor
    public Espeon(){
        
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
        return "Psybeam";
    }

    public String especial(){
        return "Dazzling Gleam";
    }

    public String defesa(){
        return "Reflect";
    }
}
