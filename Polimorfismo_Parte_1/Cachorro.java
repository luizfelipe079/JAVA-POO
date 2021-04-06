package aula_010;
public class Cachorro extends Mamifero {
    @Override
    public void locomover(){
        System.out.println("Caminhando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
}
