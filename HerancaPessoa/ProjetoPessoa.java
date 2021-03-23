package aula_008;
public class ProjetoPessoa {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Carla");
        p4.setNome("Guilherme");
        
        p1.setSexo("M");
        p3.setIdade(19);
        p4.setSexo("F");
        
        p2.setCurso("Informática");
        p3.setSalario(2500f);
        p4.setSetor("Estoque");
        
        //Metódos que são específicos de classes diferentes darão erros.
        p1.receberAumento();
        p2.mudarTrabalho();
        p4.cancelarMat();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }    
}
