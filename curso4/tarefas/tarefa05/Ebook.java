package curso4.tarefas.tarefa05;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas; 

    }
 
    public void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            
            paginaAtual++;
        }
    }

    public void retrodecerPagina() {
        if (paginaAtual > 0) {     
            paginaAtual--;
        }
    }

    public void irParaPagina(int pagina) {
       if(pagina >= 0 && pagina <= totalPaginas){
        paginaAtual = pagina;
       }
    }
    
    public int exibirPagina(){
        return paginaAtual;
    }

    public void mostrarCapa() {
        System.out.println("Titulo "+ titulo);
        System.out.println("Autor "+ autor);
        System.out.println("Total de paginas "+ totalPaginas);
    }
}
