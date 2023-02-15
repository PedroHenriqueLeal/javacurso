package curso5.tarefas.tarefa05;

public class Tarefa05 {
    public static void main(String[] args) {
        String nome[] = new String [7];
  
        nome[0] = "Pedro";
        nome[1] = "Maristela";
        nome[2] = "Jazon";
        nome[3] = "Duda";
        nome[4] = "Malu";
        nome[5] = "Victor";
        nome[6] = "Lucas";
  
        for (int i = 6; i < nome.length; i--) {
          System.out.println(nome[i]);
        }
      }
}
