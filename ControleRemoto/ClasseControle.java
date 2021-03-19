package aula_006;
//teste

public class ClasseControle implements InterfaceControle {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Métodos especiais 

    public ClasseControle() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----Menu-----");
        System.out.println("Está ligado ? " + this.isLigado());
        System.out.println("Está tocando ? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("/");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado() && this.isTocando()){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("ERRO!! Está pausado desligado!!");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado() && this.isTocando()){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("ERRO!! Está pausado ou desligado!!");
        } 
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.isTocando()){
            this.setVolume(0);
        } else {
            System.out.println("ERRO!! Está pausado ou desligado!!");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.isTocando()){
            this.setVolume(50);
        } else {
            System.out.println("ERRO!! Está pausado ou desligado!!");
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }    
    }

    @Override
    public void pause() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(false);
        }
    }
    
    
    
    
}
