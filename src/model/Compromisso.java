package model;

public class Compromisso {
     private String pessoa;
     private String local;
     private String assunto;
     private int hora;
     private int dia;
     private int mes;

public Compromisso(String pessoa, String local, String assunto, int hora, int dia, int mes) {
    this.pessoa = pessoa;
    this.local = local;
    this.assunto = assunto;
    this.hora = hora;
    this.dia = dia;
    this.mes = mes;

}

public boolean ocorreEm(int dia, int mes) {
    return this.dia == dia && this.mes == mes;
}

public void exibir(){
    System.out.println("Compromisso com: " + pessoa);
    System.out.println("Local: " + local);
    System.out.println("Assunto: " + assunto);
    System.out.println("Data: " + dia + "/" + mes + "/" +" as " + hora + "h");
    System.out.println("--------------------------------");
}

}
