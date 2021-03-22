package aula_pratica_001;
public class ProjetoLivroPessoa {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", "M", 22);
        p[1] = new Pessoa ("Maria,", "F", 25);
        
        l[0] = new Livro("Aprendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro ("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(120);
        System.out.println(l[0].detalhes());
        
    }
}
