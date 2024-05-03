
import java.util.Scanner;

public class ContaTerminai {
  int numeroBanco;
  String agencia;
  String nomeCliente;
  float saldo;

  Scanner input = new Scanner(System.in);

  public   void CadastroConta(){

    
    System.out.println("Por favor digite o numero da conta ");
     numeroBanco = input.nextInt();
     System.out.println("Por favor digite o numero da agencia");
     agencia = input.next();
     System.out.println("Por favor digite seu nome");
     nomeCliente = input.next();
     System.out.println("Por favor digite o saldo");
     saldo = input.nextFloat();

     
}
public void Bemvindo (){

    System.out.println("Ola "+ nomeCliente+ " obrigado por criar uma conta em nosso banco, sua agencia é:"+agencia+
    " ,conta: "+  numeroBanco+" e seu saldo:" + saldo+" Ja esta disponivel para saque");

}
}