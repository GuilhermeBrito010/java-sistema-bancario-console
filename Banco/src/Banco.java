import java.text.ParseException;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        ContaBancaria user1 = new ContaBancaria();
        Cliente user = new Cliente();


      user1.setSaldo(1000);
      user.setTitular("Guilherme");
      user.setSenha("157824");


        Scanner sc = new Scanner(System.in);



 if(user.validaTitular().equals("Guilherme")){



     if(user.validaSenha().equals("157824")){




     do{


         System.out.print("Escolha uma opção para continuar:   ");

         System.out.print("1 - Ver saldo  ");

         System.out.print("2 - Sacar  ");

         System.out.print("3 - Depositar  ");

         System.out.print("4 - SAIR  ");



         String escolha = sc.nextLine();



         if(escolha.equals("4")){

             System.out.println("Até logo...");


            break;



         }


         switch (escolha){

             case "1":

                 user1.mostrarSaldo();

                 break;

             case "2":

                 user1.sacar();

                 break;

             case "3":

                 user1.depositar();

                 break;

             default:

                 System.out.println("Opção inválida");

                 break;




             }
         }while (true);

     }
 }

sc.close();


    }

    }



