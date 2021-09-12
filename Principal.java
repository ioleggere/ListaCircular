public class Principal {
    public static void main(String[] args) throws Exception {
        ListaCircular teste = new ListaCircular();  
        teste.adicionarFim("A");
        teste.adicionarFim("B");
        teste.adicionarFim("C");
        teste.adicionarFim("D");
        teste.adicionarFim("E");
       System.out.println("ADICIONADOS:");
       System.out.println(teste.getPrimeiro());
       System.out.println(teste.gettail().getProximo().getValor());
       System.out.println(teste.gettail().getProximo().getProximo().getValor());
       System.out.println(teste.gettail().getProximo().getProximo().getProximo().getValor());
       System.out.println(teste.gettail().getProximo().getProximo().getProximo().getProximo().getValor());
       System.out.println("");
       System.out.println("TESTANDO METODO REMOVER");
            while (!teste.isEmpty()){
            System.out.println(teste.getPrimeiro());
            teste.remover(teste.getPrimeiro());
            }
        

            System.exit(0);
        }
    }

