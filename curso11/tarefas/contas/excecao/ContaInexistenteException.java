package curso11.tarefas.contas.excecao;

public class ContaInexistenteException extends Exception{
   public ContaInexistenteException(String msg) {
    super(msg);
   }
}
