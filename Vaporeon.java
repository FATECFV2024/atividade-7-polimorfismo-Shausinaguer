public class Vaporeon extends Eevee {

    private String nome = "Vaporeon";
    private String tipo = "Agua";

    //Construtor
    public Vaporeon(){
        
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
    public String ataque() {
        return "Water Pulse";
    }
    public String especial() {
        return "Ice Beam";
    }
    public String defesa() {
        return "Acid Armor";
    }
}
