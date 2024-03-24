public class Computador {
    public String marca;
    public float preço;
    public sistemaOperacional sistemOp = new sistemaOperacional();
    public hardwareBasico [] hardB = new hardwareBasico[10];
    public memoriaUSB memusb= new memoriaUSB;
    public void mostraPCConfigs(){
        System.out.print("Este computador é da marca " +marca +", seu sistema operacinal é " +sistemOp.nome +" (" +sistemOp.tipo +" bits) ");
    }
    public void addMemoriaUSB(memoriaUSB musb){
        this.memusb = musb;
    }

}
