package Heranca;
public class Bolsista extends Aluno {   
    private float bolsa;
    
    
    public void renovarBolsa(){
        System.out.println("Renovando a bolsa do aluno: " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Facilitando Pagamento.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
