package PraticaVideo;
public class Aula_012 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula 12 de JAVA");
        v[2] = new Video("Está chegando ao fim");
        
//        System.out.println(v[0].toString());
//        System.out.println(v[1].toString());
//        System.out.println(v[2].toString());
        
        Garfanhoto g[] = new Garfanhoto[2];
        g[0] = new Garfanhoto("Irineu", "M", 27, "VcNSabeNemEu");
        g[1] = new Garfanhoto ("Irinoa", "F", 23, "kurezita");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[1], v[0]); //irinoa assiste Aula POO
        vis[0].avaliar();;
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[1], v[2]); //irinoa assite Está chegando ao fim
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());



//        System.out.println("VÍDEOS\n-----------------------------");
//        System.out.println(v[0].toString());
//        System.out.println(v[1].toString());
//        System.out.println(v[2].toString());
//        
//        System.out.println("\nGARFANHOTOS\n-----------------------------");
//        System.out.println(g[0].toString());
//        System.out.println(g[1].toString());
    }
    
}
