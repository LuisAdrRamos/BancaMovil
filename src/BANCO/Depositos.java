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

    public double getMonto() {
        return super.getMonto();
    }

    public void depositarDinero() {
        Monto = getMonto() + Cant_Deposito;
        System.out.println("Gracias por su deposito\nSu monto ahora es de $" + Monto);
    }
}

