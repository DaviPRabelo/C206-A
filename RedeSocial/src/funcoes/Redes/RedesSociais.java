package funcoes.Redes;

public abstract class RedesSociais {
     protected String senha;
     protected int numAmigos;

     public RedesSociais(String senha, int numAmigos) {
          this.senha = senha;
          this.numAmigos = numAmigos;
     }

     public abstract void postarFoto();
     public abstract void postarVideo();
     public abstract void postarComentario();
     public void curtirPublicacao(){
          System.out.println("Publicacao curtida");
     };

     public String getSenha() {
          return senha;
     }

     public int getNumAmigos() {
          return numAmigos;
     }

     public void setNumAmigos(int numAmigos) {
          this.numAmigos = numAmigos;
     }
}
