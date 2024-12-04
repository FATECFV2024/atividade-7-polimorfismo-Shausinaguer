public class Pokedex {
    
    public static void main(String[] args) throws Exception {
        Eevee eeve = new Eevee();
        Eevee glac = new Glaceon();
        Eevee leaf = new Leafeon();
        Eevee vapo = new Vaporeon();
        Eevee flor = new Floreon();
        Eevee jolt = new Jolteon();
        Eevee espe = new Espeon();
        Eevee umbr = new Umbreon();
        Eevee sylv = new Sylveon();

        imprimir(eeve);
        imprimir(glac);
        imprimir(leaf);
        imprimir(vapo);
        imprimir(flor);
        imprimir(jolt);
        imprimir(espe);
        imprimir(umbr);
        imprimir(sylv);

    }

    //metodo imprimir
    public static void imprimir(Eevee e) {
        System.out.println("Eu sou: "+e.getNome());
        System.out.println("Tipo: "+e.getTipo());
        if (e.getNome() == "Eevee") {
            System.out.println("Peso: "+e.getPeso());
            System.out.println("Altura: "+e.getAltura());
            System.out.println("HP: "+e.getHp());
        }
        System.out.println("Ataque: "+e.ataque());
        System.out.println("Defesa: "+e.defesa());
        System.out.println("Especial: "+e.especial());
        System.out.println("  ");
    }
}
