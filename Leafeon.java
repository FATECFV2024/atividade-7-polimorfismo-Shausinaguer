public class Leafeon extends Eevee {

    private String nome = "Leafeon";
    private String tipo = "Grama";

    //Construtor
    public Leafeon(){
        
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
    public String ataque () {
        return "Leaf Blade";
    }
    public String especial() {
        return "Energy Ball";
    }
    public String defesa () {
        return "Swords Dance";
    }
}
