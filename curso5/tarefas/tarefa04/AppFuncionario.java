package curso5.tarefas.tarefa04;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Pedro", 50);

        System.out.println(func1.exibir());
        System.out.println("Salário: R$ " + func1.calcularSalario(10));
    }
}
