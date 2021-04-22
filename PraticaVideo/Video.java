package PraticaVideo;
public class Video implements acoesVideo {
    private String titulo;
    private int views, curtidas, avalia;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avalia = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getAvalia() {
        return avalia;
    }

    public void setAvalia(int avalia) {
        int nova;
        nova = (this.avalia + avalia)/this.views;
        this.avalia = nova;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
      
    @Override
    public void play() {
        if(reproduzindo) {
            System.out.println("O vídeo já está sendo reproduzido!");
        } else {
            this.reproduzindo = true;
        }
    }

    @Override
    public void pause() {
        if(reproduzindo){
            this.reproduzindo = false;
        } else {
            System.out.println("O vídeo já está pausado!");
        }
    }

    @Override
    public void like() {
        this.curtidas ++;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", views=" + views 
                + ", curtidas=" + curtidas + ", avalia=" + avalia +
                ", reproduzindo=" + reproduzindo + '}';
    }
    
    
}
