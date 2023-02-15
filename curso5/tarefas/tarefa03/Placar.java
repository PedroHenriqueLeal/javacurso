package curso5.tarefas.tarefa03;

public class Placar {
    private String nomeTime1, nomeTime2;
    private int gols1, gols2;

    public Placar() {
     nomeTime1 = "Time Mandante";
     nomeTime2 = "Time Visitante";
    }

    public Placar(String nomeTime1, String nomeTime2) {
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
    }

    public Placar(String nomeTime1, String nomeTime2, int gols1, int gols2) {
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        this.gols1 = gols1;
        this.gols2 = gols2;
    }

    public String exibir() {
        return nomeTime1 + " " + gols1 + " x " + gols2 + " " + nomeTime2;
    }
}
