package funcoes.Redes;

public class Instagram extends RedesSociais {
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando video no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentando em uma publicacao no Instagram");
    }

}
