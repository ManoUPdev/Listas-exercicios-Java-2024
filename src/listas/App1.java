import model.Ponto;

public class App1 {
    // 1. Criar ponto1 na posicao (0,0)
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        System.out.print("Ponto1: ");
        ponto1.exibirCoordenadas();

        // 2. Criar ponto2 na posicao (2, 5)
         Ponto ponto2 = new Ponto(2, 5);
        System.out.print("Ponto2: ");
        ponto2.exibirCoordenadas();

       // 3. Calcular a distancia do ponto1 ao ponto2
       double dist1 = ponto1.distancia(ponto2);
       System.out.println("Distancia do ponto 1 ao ponto 2: " + dist1);

       //4 . Calcular a distancia do ponto2 as coordenadas (7 , 2)
       double dist2 = ponto2.distancia(7,2);
       System.out.println("Distancia do ponto 2 ate: " + dist2);

      //5. ALtera o ponto x para 10
      ponto1.setX(10);
     
     //6. Altera o ponto y para 3
     ponto2.setY(3);

    System.out.print("Ponto1 atualizado");
    ponto1.exibirCoordenadas();

    }
}
