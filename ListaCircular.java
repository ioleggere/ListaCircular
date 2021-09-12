public class ListaCircular{
    private Elemento tail;
    public ListaCircular(){
        this.tail = null;
    }
    
      public Elemento gettail(){
          return this.tail;
      }
      
      public void settail(Elemento c){
          this.tail = c;
      }
      
      public Elemento avancar(){
          return this.tail.getProximo();
      }
      public Object getPrimeiro() throws Exception{
          if(tail == null)
            throw new Exception("Lista Vazia");
          
          return this.tail.getValor();
      }


      public void adicionarFim(Object obj){
        Elemento tempelemento = new Elemento(obj, null); //Passando o objeto para a classe Elemento temporaria.
        
        
        if(this.tail == null){ // verificamos se o tail esta vazio.

            tempelemento.setProximo(tempelemento); //Se for vazio so tera um elemento, entao, ele sera o proximo dele mesmo.

            this.settail(tempelemento); //Entao setamos o tail.

        }else if(this.tail == this.tail.getProximo()){ // Aqui verificamos se ja existe um elemento no tail.

            tempelemento.setProximo(tail); //No caso, o proximo elemento do elemento a ser inserido vai ser o primeiro, crianco um "ciclo".

            tail.setProximo(tempelemento); //E o proximo do unico elemento que existe vai ser o elemento inserido.

        }else{ //E aqui, é caso tenha mais de dois elementos.

            Elemento ultimo = new Elemento(tail, tail.getProximo()); // Criamos um elemento para representar o ultimo elemento da lista.

            while(!ultimo.getProximo().equals(tail)){ // E enquanto o ultimo nao for o ultimo (ter como proximo o primeiro elemento).

            ultimo = ultimo.getProximo(); // Ele avanca.

        }
            tempelemento.setProximo(tail); //O proximo do elemento a ser inserido vai ser o ultimo.

            ultimo.setProximo(tempelemento); //e o proximo do ultimo vai deixar de ser o primeiro e vai ser o elemento inserido.

        }    
        
      }
      public void adicionarInicio(Object t){
          Elemento elemento = new Elemento(t, tail);
          if(tail == null){
            elemento.setProximo(elemento);
            this.settail(elemento);
          }else{
            elemento.setProximo(tail);
            tail = elemento;
          }
        
            
      }
      public void remover(Object t) throws ListaVaziaException, ObjetoNaoEncontradoException{

        if(this.tail == null){ //Se a lista for vazia retorna a excecao.
            System.out.println("Lista Vazia");
            throw new ListaVaziaException();

        }else if(this.tail.getProximo() == tail && tail.getValor() == t){ //Se o elemento passado for o unico da lista deixamos a lista vazia.

            this.tail.setProximo(null);

            this.tail = null;
           
        }else{ // e se tiver mais de um elemento.

            Elemento temp = tail.getProximo(); //Criamos um elemento temporario que sera o segundo elemento da lista.

            Elemento prevtemp = this.tail; //E o anterior ao temporario, que sera inicializado como o primeiro.

            while(temp != tail && !temp.getValor().equals(t)){ //Enquanto o temporario nao for o primeiro e nao for igual a t
            prevtemp = temp; //Passamos para o proximo.

            temp = temp.getProximo(); //Passamos para o proximo.

        }
        if(temp == null){
            System.out.println("Objeto nao encontrado");
            
            throw new ObjetoNaoEncontradoException();
        }
            this.tail = this.tail.getProximo(); //O primeiro elemento da lista passa a ser o proximo.

            prevtemp.setProximo(temp.getProximo()); //e o proximo do anterior vai ser o proximo do valor passado, pulando esse valor.
        }
        
      }
      public boolean isEmpty (){
        return (tail == null); 
    
    }
}
