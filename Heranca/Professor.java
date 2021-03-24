package Heranca;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAumento(float valor){
        this.salario = this.salario + valor;
        System.out.println("Seu novo salário é: R$" + this.getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
