public class Main {
    public static void main(String[] args) {
        Computador []computadors = new Computador[3];
        computadors[0].sistemOp.nome = "Linux Ubuntu";
        computadors[0].sistemOp.tipo = 32;
        computadors[0].hardB[0].nome = "Pentium Core i3";
        computadors[0].hardB[0].capacidade = 2200;
        computadors[0].hardB[1].nome = "Memória RAM";
        computadors[0].hardB[1].capacidade = 8;
        computadors[0].hardB[2].nome = "HD";
        computadors[0].hardB[2].capacidade = 500;
        computadors[0].marca = "Positivo";
        computadors[0].preço = 3300f;
        computadors[0].addMemoriaUSB(new memoriaUSB("Pen-Drive", 16));
        computadors[1].sistemOp.nome = "Windows 8";
        computadors[1].sistemOp.tipo = 64;
        computadors[1].hardB[0].nome = "Pentium Core i5";
        computadors[1].hardB[0].capacidade = 3370;
        computadors[1].hardB[1].nome = "Memória RAM";
        computadors[1].hardB[1].capacidade = 16;
        computadors[1].hardB[2].nome = "HD";
        computadors[1].hardB[2].capacidade = 1000;
        computadors[1].marca = "Acer";
        computadors[1].preço = 8800f;
        computadors[1].addMemoriaUSB(new memoriaUSB("Pen-Drive", 32));
        computadors[2].sistemOp.nome = "Windows 10";
        computadors[2].sistemOp.tipo = 64;
        computadors[2].hardB[0].nome = "Pentium Core i7";
        computadors[2].hardB[0].capacidade = 4500;
        computadors[2].hardB[1].nome = "Memória RAM";
        computadors[2].hardB[1].capacidade = 32;
        computadors[2].hardB[2].nome = "HD";
        computadors[2].hardB[2].capacidade = 2000;
        computadors[2].marca = "Vaio";
        computadors[2].preço = 4800f;
        computadors[2].addMemoriaUSB(new memoriaUSB("HD Externo", 1000));



    }
}