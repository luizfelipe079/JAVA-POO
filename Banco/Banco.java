package ProjetoBanco;

public class Banco {
    public int numConta;
    private String tipoConta; 
    protected float saldoConta;
    private String nome;
    private boolean status;
    private float valor;
    
    public Banco(){
        this.status = false;
        this.saldoConta = 0;
    }
    
    public void status(){
        if(this.isStatus() == false) {
            System.out.println("A conta está fechada");
        } else {
            System.out.println("A conta está aberta");
            System.out.println("O número da conta é: " + this.getNumConta());
            System.out.println("O tipo da conta é:" + this.getTipoConta());
            System.out.println("O dono da conta é: " + this.getNome());
            System.out.println("O saldo da conta é: " + this.getSaldoConta());
        }
    }
    
    public void abrirConta(String t){
        this.setTipoConta(t);
        this.status = true;
        if("cc".equals(this.getTipoConta())){
            this.setSaldoConta(50);
        } else if("cp".equals(this.getTipoConta())) {
            this.setSaldoConta(150);
        }
    }
    
    public void fecharConta(){
        if(this.saldoConta >= 0) {
            System.out.println("ERRO!! Você ainda tem dinheiro na conta!");
        }else if(this.saldoConta < 0) {
            System.out.println("ERRO!! Você não pode fechar a conta. Saldo negativo!");
        } else {
            this.setStatus(false);
        }
        
    }
    
    public void sacar() {
        if(this.isStatus() == true && this.getSaldoConta() >= this.valor){
            this.saldoConta = this.saldoConta - this.valor;
        } else {
            System.out.println("ERRO!");
        }
    }
    
    public void depositar(){
        if(this.isStatus() == true) {
        this.saldoConta = this.saldoConta + this.valor;
        } else {
            System.out.println("ERRO! É PRECISO ABRIR UMA CONTA ANTES!");
        }
    }

    public void pagarMensalidade(String t){
        if(this.tipoConta == "cc"){
            this.saldoConta -= 12;
        } else {
            this.saldoConta -=20;
        }
    }
   
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
       public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
