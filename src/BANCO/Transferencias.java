package BANCO;
import java.util.Scanner;
public class Transferencias extends Cliente{
    double cant_Transferencia;

    public Transferencias() {
    }

    public Transferencias(double cant_Transferencia) {
        this.cant_Transferencia = cant_Transferencia;
    }

    public double getCant_Transferencia() {
        return cant_Transferencia;
    }

    public void setCant_Transferencia(double cant_Transferencia) {
        this.cant_Transferencia = cant_Transferencia;
    }

    public void transfeririDinero(double monto){
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted actual mente cuenta con $" + monto);
        System.out.println("Ingrese el numero de cuenta a la que va a tranferiri: ");
        int cuenta = sc.nextInt();
        System.out.println("Ingrese la cantidad de dinero que va a transferir: ");
        cant_Transferencia = (sc.nextDouble());

        while (cant_Transferencia >= monto){
            System.out.println("El cuenta NO tiene el suficiente monto para realizar esta accion");
            System.out.println("Ingrese la cantidad de nuevo: ");
            cant_Transferencia = sc.nextDouble();
        }
        Monto = monto - cant_Transferencia;
        System.out.println("Transferencia realizada con exito a " + cuenta + "\nEl total de tu cuenta ahora es de " + Monto);
    }
}
