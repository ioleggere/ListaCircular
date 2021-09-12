public class ListaVaziaException extends Exception{
   private ListaCircular lista;
    public ListaVaziaException(){
        super("Lista vazia");
    }
    public ListaCircular getLista(){
        return lista;
    }
}
