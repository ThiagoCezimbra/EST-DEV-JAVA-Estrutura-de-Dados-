// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    /*
     * System.out.println("Hello world!");
     * 
     * // @Test
     * // void addition() {
     * // assertEquals(2, 1 + 1);
     * // }
     * 
     * int[] nomevetor = new int[6];
     * 
     * nomevetor[4] = 40;
     * for (int i = 0; i < nomevetor.length; i++) {
     * 
     * System.out.println(i + " - " + nomevetor[i]);
     * 
     * }
     

    TADpseudovetor v1 = new TADpseudovetor();
    v1.insere(1, 25);
    v1.printar();
  }
}

class TADpseudovetor {
   int[]nomevetor2 = new int [6]; 
  int p1;
  int p2;
  int p3;
  int p4;
  int p5;

  // construtor
  public TADpseudovetor() {
    p1 = 0;
    p2 = 0;
    p3 = 0;
    p4 = 0;
    p5 = 0;
  }

  public void insere(int pos, int valor) {
    switch (pos) {
      case 0:
        p1 = valor;
        break;
      case 1:
        p2 = valor;
        break;
      case 2:
        p3 = valor;
        break;
      case 3:
        p4 = valor;
        break;
      case 4:
        p5 = valor;
        break;
    }
  }

  public void printar() {

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
    System.out.println(p5);
    */



    TADVetor v2 = new TADVetor();

    v2.insere(1, 25);
v2.printar();
     


    
  }

}
class TADVetor{

int vetor[];  

public TADVetor(){


  vetor = new int [5];

 
  
  
} 

   public void insere(int pos, int valor) {

        vetor[pos] = valor;
          
   }

public void printar(){
  for (int x: vetor){
 System.out.println(x);
  
        }

  
}   }
  


