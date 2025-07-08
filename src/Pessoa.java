import java.time.LocalDate;
import java.util.Date;

//public class Pessoa {
//    public String nome;
//    public String sobrenome;
//    public String cpf;
//    public String rg;
//    public LocalDate dataNascimento;
//    public String telefones;

    public class Pessoa{
        String nome;
        String sobrenome;
        String cpf;
        String rg;
        LocalDate dataNascimento;
        String[] telefones = new String[10];

        public void imprimirValores(){

        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Data de nascimento: " + dataNascimento);

        for(String telefone : telefones){
            if (telefone != null){
                System.out.println("Telefone: " + telefone);
            }
        }
    }
    }
//}
