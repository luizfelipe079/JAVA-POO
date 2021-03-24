package Heranca;
public class UsandoHeranca {
    public static void main(String[] args) {
        // Como a classe Pessoa é uma classe abstract, não consigo 
        // instanciar essa classe em um objeto Pessoa p1 = new Pessoa();
        
        Visitante v1 = new Visitante();
        v1.setNome("uoxitu");
        v1.setIdade(24);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(0023);
        a1.setIdade(22);
        a1.setCurso("Informática");
        a1.setSexo("M");
        
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(2241);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setNome("João");
        p1.setSalario(2650.5f);
        System.out.println(p1.toString());
        p1.receberAumento(205.7f);
        
        Tecnico t1 = new Tecnico();
        t1.setNome("James");
        t1.setRegistroProfissional(52174);
        System.out.println(t1.toString());
        t1.praticar();
    }
}
