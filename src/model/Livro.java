package model;
public class Livro {

    //classe livro

    private String Codigo;
    private String Titulo;
    private String Autores;
    private String Isbn;
    private int Ano;

    public Livro (String Codigo, String Titulo, String Autores, String Isbn, int Ano) {
        this.Codigo = Codigo;
        this.Titulo = Titulo;
        this.Autores = Autores;
        this.Isbn = Isbn;
        this.Ano = Ano;
    }
    
    public void exibirDados() {
        System.out.println("Codigo:" + Codigo );
        System.out.println("Titulo:" + Titulo);
        System.out.println("Autores:" + Autores);
        System.out.println("Isbn:" + Isbn);
        System.out.println("Ano:" + Ano);
        System.out.println("-------------------------------");
    }
}
