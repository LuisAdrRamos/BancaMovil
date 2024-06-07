package BANCO;
import java.util.Scanner;
public class Retiros extends Cliente{
    double cantidad_Retiro;

    public Retiros() {
    }

    public Retiros(double cantidad_Retiro) {
        this.cantidad_Retiro = cantidad_Retiro;
    }

    public double getCantidad_Retiro() {
        return cantidad_Retiro;
    }

    public void setCantidad_Retiro(double cantidad_Retiro) {
        this.cantidad_Retiro = cantidad_Retiro;
    }

    public void retirarDinero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que desea retirar de su cuenta: ");
        cantidad_Retiro = sc.nextDouble();

        while (cantidad_Retiro >= Monto){
            System.out.println("El cuenta NO tiene el suficiente monto para realizar esta accion");
            cantidad_Retiro = sc.nextDouble();
        }
        Monto = Monto - cantidad_Retiro;
        System.out.println("Retiro realizado con exito\nEl total de tu cuenta ahora es de " + Monto);
    }
}