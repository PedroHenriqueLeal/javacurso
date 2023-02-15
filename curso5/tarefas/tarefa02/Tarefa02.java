package curso5.tarefas.tarefa02;

public class Tarefa02 {
    public static void main(String[] args) {
        
        Animais animal1 = new Animais("Lulu", "rottweiler", 2015, "Marcos", "(11) 1234-5678");

        System.out.println(animal1.getDados());


        Proprietario pr1 = new Proprietario("Gisele", "(11) 1234-5678");

        Animais animal2 = new Animais("Lessie", "Lessie", 2020, pr1);

        System.out.println(animal2.getDados());

        // trocar o telefone do proprietário do animal2 ? (set)
        pr1.setTelefone("(12) 9999-8888");
        System.out.println(animal2.getDados());

        // trocar o telefone do proprietário do animal1 ? (set)
        animal1.getProprietario().setTelefone("(23) 8876-2323");
        System.out.println(animal1.getDados());

}
}
