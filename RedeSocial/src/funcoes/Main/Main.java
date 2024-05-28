package funcoes.Main;

import Excecoes.LimiteDeAmigosException;
import Excecoes.SenhaInvalida;
import funcoes.Redes.*;

public class Main {
    public static void main(String[] args) {
        RedesSociais[] redes = {new Facebook("AAAA", 258), new Twitter("BBBB",3400), new GooglePlus("CCCC", 65)};

        Usuario user1 = new Usuario(redes);

        user1.setEmail("aaaa@aaaa.aa");
        user1.setNome("Jorge");

        try {
            user1.usarFacebook("AAAA");
        }catch (SenhaInvalida e){
            System.out.println(e.getMessage());
        }
        try {
            user1.usarTwitter("BBBB");
        }catch (SenhaInvalida e){
            System.out.println(e.getMessage());
        }
        try {
            user1.usarGoogle("DDDD");
        }catch (SenhaInvalida e){
            System.out.println(e.getMessage());
        }
        try{
            user1.adcAmigo();
        }catch (LimiteDeAmigosException e){
            System.out.println(e.getMessage());
        }
    }
}