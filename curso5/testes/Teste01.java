package curso5.testes;

public class Teste01 {
    public static void main(String[] args) {
        
        int numero[] = new int[5];
        
        numero[0] = 10;
        numero[1] = 20;
        numero[2] = 30;
        numero[3] = 40;
        numero[4] = 50;
        
        for(int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }
    
}