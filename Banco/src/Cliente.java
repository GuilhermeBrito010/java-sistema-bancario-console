import java.util.Scanner;

public class Cliente {

    Scanner sc = new Scanner(System.in);

    private String titular;

    private String senha;


    public void setTitular(String titular) {

        this.titular = titular;
    }

    public void setSenha(String senha) {

        this.senha = senha;
    }

    public String validaTitular() {

        String acessoTitular;
        do {


            System.out.print("   Digite seu nome de usuario ou digite SAIR para cancelar :  ");

            acessoTitular = sc.next();


            if (acessoTitular.equalsIgnoreCase("SAIR")) {

                System.out.print("Ate logo...");

                break;
            }


            else if (!acessoTitular.equals(titular)) {

                System.out.print("   Usuario não encontrado  ");


            }else{

                break;
            }


        } while (true);
        return (acessoTitular);
    }

    public String validaSenha() {

        int tentativas =3;

        String acessoSenha;
        do {





                System.out.print("   Digite sua senha ou digite SAIR para cancelar:   ");







                acessoSenha = sc.next();

            if (acessoSenha.equalsIgnoreCase("SAIR")) {

                System.out.print("Ate logo...");

                break;
            }

            else if (!acessoSenha.equals(senha)) {

                tentativas--;

                System.out.format("   Senha incorreta restam %d tentativas  ", tentativas);

                if(tentativas==0){
                    System.out.print("Voce exedeu o numero de tentativas entre em contato com uma Agencia");
                    break;

                }



            } else {


               break;
            }
        } while (true);
        return (acessoSenha);


    }
    }













