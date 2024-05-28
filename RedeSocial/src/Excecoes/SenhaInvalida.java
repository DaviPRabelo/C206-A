package Excecoes;

public class SenhaInvalida extends RuntimeException{
    public SenhaInvalida(String msg){
        super(msg);
    }
}
