package curso4.tarefas.tarefa04;

public class Tarefa04 {
   public static void main(String[] args) {
    
       Relogio relogio = new Relogio(16, 6, 34);
       
       System.out.println("Hora: "+ relogio.getHora());
       System.out.println("Minuto: "+ relogio.getMinuto());
       System.out.println("Seundo: "+ relogio.getSegundo());
       
       System.out.println("----");
       relogio.exibir();
       
    }
}

