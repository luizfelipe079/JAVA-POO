package aula_007;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private int vitorias;
    private int derrotas;
    private int empates;
    private float peso;
    private float altura;

    public Lutador(String no, String na, int id, int vi, int de, int em, float pe, float al) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
        this.setPeso(pe);
        this.setAltura(al);
    }
    
    public void apresentar(){
        System.out.println("Apresentamos o Lutador: " + this.getNome());
        System.out.println("Vindo de: " + this.getNacionalidade());
        System.out.println("com " + this.getAltura() +"m");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println("Com o cartel de: " + this.getVitorias() + " Vitórias;");
        System.out.println(this.getDerrotas() + " Derrotas e");
        System.out.println(this.getEmpates() + " Empates!");
    }
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas()+ " vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido!";
        } else if (this.peso <= 70.3) {
         this.categoria = "Leve";   
        } else if(this.peso <= 83.9){
            this.categoria = "Média";
        } else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido!";
        }
    } 

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}


