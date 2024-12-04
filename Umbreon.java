public class Umbreon extends Eevee {
    
    private String nome = "Umbreon";
    private String tipo = "Noturno";

    //Construtor
    public Umbreon(){
        
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
        return "Foul Play";
    }

    public String especial(){
        return "Dark Pulse";
    }

    public String defesa(){
        return "Protect";
    }
}
