package funcoes.Redes;

import funcoes.Extras.Compartilhamento;

public class Twitter extends RedesSociais implements Compartilhamento {
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando video no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentando em uma publicacao no Twitter");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando algo no Twitter");
    }

}
