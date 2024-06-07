package BANCO;
import java.util.Scanner;
public class Depositos extends Cliente{
    double Cant_Deposito;

    public Depositos() {
    }

    public Depositos(double cant_Deposito) {
        Cant_Deposito = cant_Deposito;
    }

    public double getCant_Deposito() {
        return Cant_Deposito;
    }

    public void setCant_Deposito(double cant_Deposito) {
        Cant_Deposito = cant_Deposito;
    }

    public void depositarDinero(double monto) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted actual mente cuenta con $" + monto);
        System.out.println("Ingrese la cantidad de va a depositar a su cuenta: ");
        Cant_Deposito = (sc.nextDouble());
        Monto = monto + Cant_Deposito;
        System.out.println("Gracias por su deposito\nSu monto ahora es de $" + Monto);
    }
}

