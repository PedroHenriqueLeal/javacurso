package curso5.tarefas.tarefa03;

public class Tarefa03 {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("Flamengo", "Vasco");
        Placar p3 = new Placar("Flamengo", "Vasco", 4, 0);

        System.out.println(p1.exibir());
        System.out.println(p2.exibir());
        System.out.println(p3.exibir());
    
    } 
}
