package ReprodutoresMusicais;
public class MP3 implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música no MP3");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no MP3");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica + " no MP3");
    }
}
