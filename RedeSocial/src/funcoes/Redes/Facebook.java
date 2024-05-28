package funcoes.Redes;

import funcoes.Extras.Compartilhamento;
import funcoes.Extras.VideoConferencia;

public class Facebook extends RedesSociais implements Compartilhamento, VideoConferencia {

    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando video no facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentando em uma publicacao no facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando algo no facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo video-chamada pelo facebook");
    }
}
