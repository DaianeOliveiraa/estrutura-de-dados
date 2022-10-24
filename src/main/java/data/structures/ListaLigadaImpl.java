package data.structures;


public class ListaLigadaImpl<T> {

    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public ListaLigadaImpl(No<T> inicio, No<T> fim, int tamanho) {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public ListaLigadaImpl() {

    }

    public void inserirInicio(T data) {
       No<T> cedula = new No<T>(data);
       if(this.tamanho == 0) {
           this.fim = cedula;
       } else {
           this.fim.setProximo(cedula);
       }
       this.inicio = cedula;
       this.tamanho++;

   }
   public void inserirFinal(T data) {
       No<T> cedula = new No<T>(data);
       if(this.tamanho == 0) {
           this.inicio = cedula;
       } else {
           this.fim.setProximo(cedula);
       }
       this.fim = cedula;
       this.tamanho++;

   }

   public void removerInicio() {
       if (tamanho != 0) {
           this.inicio = this.inicio.getProximo();
           tamanho--;
       } else {
           System.out.printf("Lista vazia");
       }
   }

    public void removeFinal() {
        if (tamanho == 0) return;
        if (tamanho == 1) {
            this.inicio = null;
        } else {
            No<T> cur = inicio;
            for (int i=0; i<tamanho-2; i++)
                cur = cur.getProximo();
            cur.setProximo(cur.getProximo().getProximo());
        }
        tamanho--;
    }


   public int getTamanho() {
       return this.tamanho;
   }



    public static void main(String[] args){

        ListaLigadaImpl<Integer> lista = new ListaLigadaImpl<>();
        lista.inserirInicio(11);
        lista.inserirInicio(2);
        lista.inserirInicio(9);
        lista.inserirInicio(3);
        lista.inserirInicio(6);

        System.out.println("****Tamanho da lista****");
        System.out.println(lista.getTamanho());
        System.out.println("****Primeiro elemento da lista****");
        System.out.println(lista.inicio.getData());
        System.out.println("****Último elemento da lista****");
        System.out.println(lista.fim.getData());

        lista.inserirFinal(1);
        lista.inserirFinal(100);

        System.out.println("****Tamanho da lista****");
        System.out.println(lista.getTamanho());
        System.out.println("****Primeiro elemento da lista****");
        System.out.println(lista.inicio.getData());
        System.out.println("****Último elemento da lista****");
        System.out.println(lista.fim.getData());

        lista.removerInicio();

        System.out.println("****Tamanho da lista****");
        System.out.println(lista.getTamanho());
        System.out.println("****Primeiro elemento da lista****");
        System.out.println(lista.inicio.getData());

        lista.removeFinal();
        System.out.println("****Tamanho da lista****");
        System.out.println(lista.getTamanho());
        System.out.println("****Primeiro elemento da lista****");
        System.out.println(lista.fim.getData());

        System.out.printf("");

        }
}
