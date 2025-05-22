package model;

public class Ponto {
    private double x;
    private double y;

    //Construtor padrao : ponto na origem (0,0)
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    //Construtor com as coordenadas
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Getters and Setters
     public double getX() {
        return x;
     }

    public void setX(double x) {
        this.x = x;
    }

     public double getY() {
        return y;
     }


    public void setY(double y) {
        this.y = y;
    }

    //Metodo para calcular a distancia ate outro ponto
    public double distancia(Ponto outro) {
        return Math.sqrt(Math.pow(this.x - outro.x, 2) + Math.pow(this.y - outro.x, 2));
    }

    //Metodo para calcular distancia ate coordenadas x e y
    public double distancia(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x,2)+ Math.pow(this.y - y,2 ));
    }

    //Metodo para exibir as coordenadas
    public void exibirCoordenadas(){
        System.out.println("(" + x +", " + y + ")");
    }


}