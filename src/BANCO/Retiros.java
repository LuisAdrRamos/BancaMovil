package BANCO;
import java.util.Scanner;
public class Retiros extends Cliente{
    double cantidad_Retiro;
    Cliente cliente;
    public Retiros(Cliente cliente) {
        this.cliente = cliente;
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
        System.out.println("Usted actual mente cuenta con $" + cliente.getMonto());
        System.out.println("Ingrese la cantidad de dinero que va a retirar: ");
        cantidad_Retiro = (sc.nextDouble());
        while (cantidad_Retiro >= cliente.getMonto()){
            System.out.println("El cuenta NO tiene el suficiente monto para realizar esta accion");
            System.out.println("Ingrese la cantidad de nuevo: ");
            cantidad_Retiro = sc.nextDouble();
        }
        cliente.setMonto(cliente.getMonto() - cantidad_Retiro);
        System.out.println("Retiro realizado con exito\nEl total de tu cuenta ahora es de " + cliente.getMonto());
    }
}
