import java.util.Scanner;
import BANCO.Cliente;
import BANCO.Depositos;
import BANCO.Retiros;
import BANCO.Transferencias;
import BANCO.Pago_Servicios;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente("Adrian04","12345",200404,1756175558,520);
        double monto = cliente.getMonto();

        Depositos deposito = new Depositos();
        Retiros retiro = new Retiros();
        Transferencias transferencia = new Transferencias();
        Pago_Servicios pago_servicio = new Pago_Servicios();

        System.out.println("¡BIENVENIDO A LA BANCA MOVIL DE BANCO PACIFICO!");

        System.out.println("Hola de nuevo\n¿Que accion desea realizar hoy?");
        System.out.println("\n\t1. Depositar dinero\n\t2. Retirar dinero\n\t3. Transferir dinero\n\t4. Pagar Servicios\n\t5. Perfil\n\t6. Cerrar Sesion");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("\tDEPOSITOS");
                deposito.depositarDinero(monto);
                break;
            case 2:
                System.out.println("\tRETIROS");
                retiro.retirarDinero(monto);
                break;
            case 3:
                System.out.println("\tTRANSFERENCIAS");

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                System.out.println("Gracias por usar el servicio");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}