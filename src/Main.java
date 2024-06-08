import java.util.Scanner;
import BANCO.Cliente;
import BANCO.Depositos;
import BANCO.Retiros;
import BANCO.Transferencias;
import BANCO.Pago_Servicios;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Cliente cliente = new Cliente("Adrian04","12345",200404,1756175558,520);

        Depositos deposito = new Depositos(cliente);
        Retiros retiro = new Retiros(cliente);
        Transferencias transferencia = new Transferencias(cliente);
        Pago_Servicios pago_servicio = new Pago_Servicios(cliente);

        System.out.println("¡BIENVENIDO A LA BANCA MOVIL DE BANCO PACIFICO!");

        do {
            System.out.println("Hola de nuevo\n¿Que accion desea realizar hoy?");
            System.out.println("\n\t1. Depositar dinero\n\t2. Retirar dinero\n\t3. Transferir dinero\n\t4. Pagar Servicios\n\t5. Perfil\n\t6. Cerrar Sesion");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("\tDEPOSITOS");
                    deposito.depositarDinero();
                    break;
                case 2:
                    System.out.println("\tRETIROS");
                    retiro.retirarDinero();
                    break;
                case 3:
                    System.out.println("\tTRANSFERENCIAS");
                    transferencia.transfeririDinero();
                    break;
                case 4:
                    System.out.println("\tPAGOS DE SERVICIOS");
                    System.out.println("Seleccione el servicio que quiera pagar: ");
                    System.out.println("\n\t1. Luz\n\t2. Agua\n\t3. Internet\n\t4. Regresar");
                    int op2 = sc.nextInt();
                    switch (op2) {
                        case 1:
                            System.out.println("\nPAGO DE LUZ");
                            pago_servicio.pagarLUz();
                            break;

                        case 2:
                            System.out.println("\nPAGO DE AGUA");
                            pago_servicio.pagarAgua();
                            break;

                        case 3:
                            System.out.println("\nPAGO INTERNET");
                            pago_servicio.pagarInternet();
                            break;

                        case 4:
                            System.out.println("Regresando...");
                            break;

                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Mostrar Perfil");
                    cliente.imprimirDatosCliente();
                    break;

                case 6:
                    System.out.println("Gracias por usar el servicio");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(op!=6);
    }
}