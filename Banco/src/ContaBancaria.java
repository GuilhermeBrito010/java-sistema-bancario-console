import java.math.BigDecimal;
import java.util.Scanner;

public class ContaBancaria {

    Scanner sc = new Scanner(System.in);

    private float saldo;


   public void setSaldo(float saldo){

        if(saldo >= 0) {
            this.saldo = saldo;
        }
    }

    void depositar(){
        System.out.print("Digite o valor do depósito: ");
        float valor = sc.nextFloat();

        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    void sacar(){
        System.out.print("Digite o valor do saque: ");
        float valor = sc.nextFloat();

        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    void mostrarSaldo(){
        System.out.format("Saldo atual: %.2f%n", saldo);


    }
}



