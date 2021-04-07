package Mamifero;
public class Execucao {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Cachorro c = new Cachorro();
        Lobo l = new Lobo();
       
        m.emitirSom();
        c.emitirSom();
        l.emitirSom();
        
        c.reagir("Toma comida");
        c.reagir("Chega");
        c.reagir("Lindo");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(14, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(12, 2.5f);
    }
}
