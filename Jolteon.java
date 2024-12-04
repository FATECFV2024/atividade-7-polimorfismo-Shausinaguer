public class Jolteon extends Eevee {

    private String nome = "Jolteon";
    private String tipo = "Eletrico";

    //Construtor
    public Jolteon(){
        
    }

    //Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Metodoss
    public String ataque(){
        return "Trovoada - Thunder-Shock";
    }
    public String defesa() {
        return "Carga - Wild Charge";
    }
    public String especial() {
        return "Raio - Thunder";
    }
}
