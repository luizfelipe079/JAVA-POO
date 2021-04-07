package Mamifero;
public class Cachorro extends Mamifero {
    @Override
    public void emitirSom(){
        System.out.println("AU! AU!");
    }
    
    public void reagir(String frase){
        if("Toma comida".equals(frase) || "Chega".equals(frase)){
            System.out.println("Abanar o rabo e latir!");
        } else {
            System.out.println("Rosnar!");
        }
    }
    public void reagir(int hora, int min){
        if(hora < 12) {
            System.out.println("Abanar o rabo!");
        } else if(hora >= 18){
            System.out.println("Ignorar!");
        } else {
            System.out.println("Abanar o rabo e Latir!");
        }
    }
    public void reagir(boolean dono) {
        if(dono){
            System.out.println("Abanar o rabo!");
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar o rabo!");
            } else {
                System.out.println("Latir!");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar!");
            } else {
                System.out.println("Ignorar!");
            }
        }
    }
}
