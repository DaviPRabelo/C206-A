package funcoes.Redes;

import funcoes.Extras.Compartilhamento;
import funcoes.Extras.VideoConferencia;

public class GooglePlus extends RedesSociais implements Compartilhamento, VideoConferencia {
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando video no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentando em uma publicacao no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando algo no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo video-chamada pelo GooglePlus");
    }
}
