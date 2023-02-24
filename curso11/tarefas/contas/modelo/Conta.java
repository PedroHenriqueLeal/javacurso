package curso11.tarefas.contas.modelo;

// public abstract class Conta {
//     private int numero;
//     private double saldo;
    
    
//     public Conta(int numero) {
//         this.numero = numero;
//     }


//     public int getNumero() {
//         return numero;
//     }


//     public double getSaldo() {
//         return saldo;
//     }

//     public void depositar(double valor) {
//         if (valor > 0) {
//             saldo += valor; // saldo = saldo + valor;
//         } 
//     }
   

//     public void sacar(double valor) { // É o valor de quanto vc quer sacar
//         if (valor > 0) {              // e por isso tem que ser maior que 0;
//             saldo -= valor; // saldo = saldo - valor;
//         }
//     }


//     @Override
//     public String toString() {
//         return "[numero=" + numero + ", saldo=" + saldo + "]";
//     }

// }



// Outra forma de resolver

 public abstract class Conta {
     private int numero;
     private double saldo;
    
    
     public Conta(int numero) {
         this.numero = numero;
     }


     public int getNumero() {
         return numero;
     }


     public double getSaldo() {
         return saldo;
     }

     
      public boolean depositar(double valor) {
         if (valor > 0) {
              saldo += valor; //saldo = saldo + valor;
               return true;
          }else {
              return false;
          }
      }


      public boolean sacar(double valor) { 
          if (valor > 0) { 
            saldo -= valor;  // saldo = saldo - valor;                        
               return true;
       }
              return false; // não precisa colcar o else.
     }


     @Override
          public String toString() {
        return "[numero=" + numero + ", saldo=" + saldo + "]";
     }

 }

