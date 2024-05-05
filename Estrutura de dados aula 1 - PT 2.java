import java.awt.print.Printable;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");


    ListaEstatica001 lista = new ListaEstatica001();

    lista.insere(25);
    lista.printar();

  
  
  
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }

  
}

class ListaEstatica001 {

  int[] vetor;
  int tamanho; // a partir dela eu vou saber o tamanho maximo estabelecido na lista

  public ListaEstatica001() {

    vetor = new int[10]; // aqui eu estebeleço o tamanho maximo da minha lista.
    tamanho = 0;
  }

  public void inserenoinicio(int valorinsert) {

    for (int i = tamanho; i > 0; i--) {

      vetor[tamanho] = vetor[tamanho] - 1;
    }
    vetor[0] = valorinsert;
    tamanho++;

  }

  public void inserenomeio(int pos, int valorinsertmeio) {
    for (int i = tamanho; i > pos; i--) {

      vetor[tamanho] = vetor[tamanho] - 1;
    }
    vetor[pos] = valorinsertmeio;
    tamanho++;

  }

  public void inserenofim(int valor) {

    vetor[tamanho] = valor;
    tamanho++;

  }

  public void insere(int pos, int valor) {

    if (temEspaco()) {
      if (Testedeposicao(pos)) {

        if (pos == 0) {
          inserenoinicio(valor);
        } else if (pos == tamanho) {

          inserenofim(valor);
        } else {

          inserenomeio(pos, valor);

        }

      }

    }
  }

  public void insere(int valor) {

    if (temEspaco()) {

      if (tamanho == 0) {
        inserenoinicio(valor);
      } else {

        inserenofim(valor);

      }

    }
  }

  public boolean Testedeposicao(int pos) {

    return ((pos >= 0) && (pos < (tamanho - 1)));

  }

  public boolean temEspaco() {

    return (tamanho < vetor.length - 1);

  }

  public void printar() {

    System.out.println("--------------");
    for (int i = 0; i < tamanho; i++) {
      System.out.println(vetor[i]);

    }
  }
}