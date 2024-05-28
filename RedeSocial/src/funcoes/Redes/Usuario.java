package funcoes.Redes;

import Excecoes.LimiteDeAmigosException;
import Excecoes.SenhaInvalida;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nome;
    private String email;
    private Set<RedesSociais> redes = new HashSet<RedesSociais>(4);
    public Usuario(RedesSociais[] redesSociais){
        Collections.addAll(this.redes, redesSociais);
    }
    public void usarFacebook(String senha) throws SenhaInvalida {
        for (RedesSociais rede : this.redes) {
            if (rede instanceof Facebook) {
                Facebook facebook = (Facebook) rede;
                if (facebook.getSenha() == senha) {
                    facebook.fazStreaming();
                    facebook.compartilhar();
                    facebook.postarFoto();
                } else {
                    throw new SenhaInvalida("Senha do Facebook incorreta");
                }

            }
        }
    }
    public void usarTwitter(String senha) throws SenhaInvalida {
        for (RedesSociais rede : this.redes) {
            if (rede instanceof Twitter) {
                Twitter twitter = (Twitter) rede;
                if (twitter.getSenha() == senha) {
                    twitter.postarVideo();
                    twitter.postarComentario();
                    twitter.curtirPublicacao();
                } else {
                    throw new SenhaInvalida("Senha do Twitter incorreta");
                }

            }
        }
    }
    public void usarGoogle(String senha) throws SenhaInvalida {
        for (RedesSociais rede : this.redes) {
            if (rede instanceof GooglePlus) {
                GooglePlus googlePlus = (GooglePlus) rede;
                if (googlePlus.getSenha() == senha) {
                    googlePlus.postarVideo();
                    googlePlus.curtirPublicacao();
                    googlePlus.fazStreaming();
                } else {
                    throw new SenhaInvalida("Senha do GooglePlus incorreta");
                }

            }
        }
    }
    public void usarInstagram(String senha) throws SenhaInvalida {
        for (RedesSociais rede : this.redes) {
            if (rede instanceof Instagram) {
                Instagram instagram = (Instagram) rede;
                if (instagram.getSenha() == senha) {
                    instagram.postarVideo();
                    instagram.curtirPublicacao();
                    instagram.postarFoto();
                } else {
                    throw new SenhaInvalida("Senha do Instagram incorreta");
                }

            }
        }
    }
    public void adcAmigo() throws LimiteDeAmigosException {
        for (RedesSociais rede : this.redes) {
            if (rede instanceof Facebook) {
                Facebook facebook = (Facebook) rede;
                if(facebook.getNumAmigos() < 258)
                {
                    facebook.setNumAmigos(facebook.numAmigos+1);
                }
                else{
                    throw new LimiteDeAmigosException("Limite de amigos do face atingida");
                }
            }
            if (rede instanceof Twitter) {
                Twitter twitter = (Twitter) rede;
                if(twitter.getNumAmigos() < 450)
                {
                    twitter.setNumAmigos(twitter.numAmigos+1);
                } else{
                    throw new LimiteDeAmigosException("Limite de amigos do Twitter atingida");}
            }
            if (rede instanceof GooglePlus) {
                GooglePlus googlePlus = (GooglePlus) rede;
                if (googlePlus.getNumAmigos() < 242) {
                            googlePlus.setNumAmigos(googlePlus.numAmigos + 1);
                } else {
                    throw new LimiteDeAmigosException("Limite de amigos do GogglePlus atingida");}
            }
            if (rede instanceof Instagram) {
                Instagram instagram = (Instagram) rede;
                if (instagram.getNumAmigos() < 289) {
                    instagram.setNumAmigos(instagram.numAmigos + 1);
                } else {
                    throw new LimiteDeAmigosException("Limite de amigos do Instagram atingida");
                }
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
