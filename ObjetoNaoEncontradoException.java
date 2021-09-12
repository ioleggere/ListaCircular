public class ObjetoNaoEncontradoException extends Exception{
    private Object data;
    public ObjetoNaoEncontradoException (){
        super("Objeto não encontrado");
    }
    public Object getData(){
        return data;
    }
}
