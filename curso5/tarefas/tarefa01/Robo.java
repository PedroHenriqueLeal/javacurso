package curso5.tarefas.tarefa01;

public class Robo {
    private int posX, posY, max;
        private final int MAX_DEFAULT = 100;
    
        public Robo(int max){
        if(max > 0) {
            this.max = max;
        }else {
            this.max = MAX_DEFAULT;
        }
        
        }
        
        public void moverNorte() {
        if (posY < max) {
            posY++;
            
        }
    
        }

        public void moverSul() {
            if (posY > -max) {
                posY--;
                
            }
        
            }

         public void moverLeste() {
                if (posX < max) {
                    posX++;
                    
                }
            
                }

         public void moverOeste() {
                    if (posX > -max) {
                        posX--;
                        
                    }
                
                    }

    
        public String posicaoAtual() {
            return "x: " + posX + " y: " + posY;
        }
}
