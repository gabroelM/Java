import java.util.Date;

public class Carro {

    long qtqRetrovisor; //default '' = 0 //
    int qtqRodas;//default = 0 //
    String cor; //default = NULL //
    String modelo; //default = NULL //
    boolean ligado; //default '' = false //
    double preco; //default '' = 0,0 //

    public void ligar(){
        System.out.println("Carro ligou");
        ligado = true;


    }

    public void desligar(){
        System.out.println("Carro desligado");
        ligado = false;
    }


}







