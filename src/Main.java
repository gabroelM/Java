import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

//        System.out.println("Iniciando carro");
//
//        String proprietario = "Gustavo";
//        Carro veiculoComercialGustavo = new Carro();
//        veiculoComercialGustavo.cor = "Cinza";
//        veiculoComercialGustavo.preco = 9000;
//        veiculoComercialGustavo.qtqRetrovisor = 6;
//        veiculoComercialGustavo.qtqRodas = 3;
//        veiculoComercialGustavo.modelo = "Kwid";
//        veiculoComercialGustavo.ligar();
//        System.out.println(veiculoComercialGustavo.preco);
//
//        Carro veiculoPessoalJose = new Carro();
//        veiculoPessoalJose.cor = "Branco";
//        veiculoPessoalJose.preco = 8000;
//        veiculoPessoalJose.qtqRodas = 2;
//        veiculoPessoalJose.ligar();
//        veiculoPessoalJose.desligar();
//        System.out.println(veiculoPessoalJose.ligado);
//
//        Carro[] carros = new Carro[100];
//        for (int i = 0; i < 100; i++) {
//        Carro carro= new Carro();
//        carro.cor = "Preto";
//        carro.preco = 8000 * i;
//        carro.ligar();
//
//        carros[i] = carro;
//        }
//
//        for (int i = 0; i < carros.length; i++) {
//            System.out.println(carros[i].preco);
//            carros[i].desligar();
//        }
//
//        for(Carro carro: carros) {
//            carro.desligar();
//        }

        Pessoa gabriel = new Pessoa();
        gabriel.nome = "Gabriel";
        gabriel.sobrenome = "Melo Vieira";
        gabriel.cpf = "123.456.789-10";
        gabriel.rg = "12345";
        gabriel.dataNascimento = LocalDate.of(2006, 8, 2);
        gabriel.telefones[0] = "48 9999-9999";
        gabriel.telefones[1] = "48 8888-8888";

        gabriel.imprimirValores();

    }
}

