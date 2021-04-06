package aula_010;
public class Aula_010 {
    public static void main(String[] args) {
        //Animal n = new Animal(); Não funciona pois animal é abstrato
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        
        m.setPeso(35.5f);
        m.setCorPelo("Preto");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        a.locomover();
        p.locomover();
        r.locomover();
        
        c.locomover();
        ca.locomover();
        c.emitirSom();
        ca.emitirSom();
        
        
    }
    
}
