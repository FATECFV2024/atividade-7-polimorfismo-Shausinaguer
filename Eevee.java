public class Eevee {
    private String nome = "Eevee";
    private String tipo = "Normal";
    private double peso = 7.5;
    /*altura modificada do tipo "int" para "double"
      para o pokemon nao ficar gigante */
    private double altura = 0.45;
    private int hp = 60;

    //Construtor
    public Eevee() {
        
    }

    //metodos (que se repetem para as evolucoes)
    public String ataque(){
        return "Ataque rapido";
    }
    public String defesa(){
        return "Desvio";
    }
    public String especial(){
        return "Tri-ataque";
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Getters e Setters que so foram usados na Eevee
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    
}
