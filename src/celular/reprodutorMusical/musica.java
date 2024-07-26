package celular.reprodutorMusical;

public class musica implements Musical {

    @Override
    public void tocar(){
    System.out.println("Música iniciada!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
