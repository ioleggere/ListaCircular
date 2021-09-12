public class Elemento {
    private Object valor;
    private Elemento proximo;

    public Elemento(Object novovalor, Elemento p){
        this.valor = novovalor;
        this.proximo = p;
    }

    public void setValor(Object v){
        this.valor = v;
      }
      
      public void setProximo(Elemento p){
        this.proximo = p;
      }
  
      public Object getValor(){
          return this.valor;
      }
  
      public Elemento getProximo(){
          return this.proximo;
      }
}
