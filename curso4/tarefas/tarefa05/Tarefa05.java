package curso4.tarefas.tarefa05;

import java.util.Scanner;

public class Tarefa05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        String titulo, autor;
        int numeroPaginas, opcaoMenu = 0;
        Ebook livro;
 
        System.out.print("Qual é o titulo do livro? ");
        titulo = entrada.nextLine();
        System.out.print("Qual o nome do autor? ");
        autor = entrada.nextLine();
        System.out.print("Qual o número de paginas?");
        numeroPaginas = entrada.nextInt();
 
        livro = new Ebook(titulo, autor, numeroPaginas);
 
        System.out.println("Livro criado:");
        livro.mostrarCapa();
 
        while (opcaoMenu != 4) {
         System.out.println("1 - mostrar a capa");
         System.out.println("2 - próxima pagina");
         System.out.println("3 - pagina anterior");
         System.out.println("4 - sair");
         opcaoMenu = entrada.nextInt();
 
         switch (opcaoMenu) {
             case 1:
                 livro.mostrarCapa();
                 break;
              case 2:
                 livro.avancarPagina();
                 System.out.println("Agora você está na página: "+ livro.exibirPagina());
                 break;
              case 3:
                livro.retrodecerPagina();
                 break;
              case 4:
                 System.out.println("Fim");
                 break;
         
             default:
                 break;
         }
 
        }
 
 
        entrada.close();
     }
}
