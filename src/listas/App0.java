import model.Livro;

public class App0 {
    public static void main(String[] args) {
        Livro livro1 = new Livro(" 1598FHK ", " Core Java 2 ", " Cay S.Horstmann e Gary Cornell "," 0130819336 ", 2005 );
        Livro livro2 = new Livro(" 9865PLO ", " Como Programar ", " Harvey Deitel ", " 0130341517 ", 2015);

        System.out.println("DADOS DOS LIVROS");
        System.out.println("----------------------------");
        livro1.exibirDados();
        livro2.exibirDados();
        
    }

    
}