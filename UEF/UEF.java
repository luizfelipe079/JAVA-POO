package aula_007;
public class UEF {
    public static void main(String[] args) {
       Lutador l[] = new Lutador[6];
       
       l[0] = new Lutador("Pretty Boy", "França", 31, 11, 2, 1, 68.9f, 1.75f);
       //Lutador L1 = new Lutador("Pretty Boy", "França", 31, 11, 2, 1, 68.9f, 1.75f);
       
       l[1] = new Lutador("Putscript", "Brasil", 29, 14, 2, 3, 57.8f, 1.68f);
       
       l[2] = new Lutador("Snapshadow", "EUA", 35, 12, 2, 1, 80.9f, 1.65f);
       
       l[3] = new Lutador("Dead Code", "Austrália", 28, 13, 0, 2, 81.6f, 1.93f);
       
       l[4] = new Lutador("UF0Cobol", "Brasil", 37, 5, 4, 3, 119.3f, 1.70f);
       
       l[5] = new Lutador("Nerdaart", "EUA", 30, 12, 2, 4, 105.7f, 1.81f);
       
       //l[2].ganharLuta();
       Luta f1 = new Luta();
       f1.marcarLuta(l[4], l[5]);
       f1.lutar();
       l[0].status();
       l[1].status();
    }
    
}
