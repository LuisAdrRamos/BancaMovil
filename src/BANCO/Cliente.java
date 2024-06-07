package BANCO;
import java.util.Scanner;
public class Cliente {
    String Usuario;
    String Password;
    int Num_Cuenta;
    int Cedula;
    double Monto;

    public Cliente() {
    }

    public Cliente(String usuario, String password, int num_Cuenta, int Cedula, double monto) {
        Usuario = usuario;
        Password = password;
        Num_Cuenta = num_Cuenta;
        Cedula = Cedula;
        Monto = monto;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getNum_Cuenta() {
        return Num_Cuenta;
    }

    public void setNum_Cuenta(int num_Cuenta) {
        Num_Cuenta = num_Cuenta;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double monto) {
        Monto = monto;
    }

    public int getCedula() {
        return Cedula;
    }
    public void setCedula(int cedula) {
        this.Cedula = cedula;
    }

    public void imprimirDatosCliente(){
        System.out.println("Usuario: " + getUsuario());
        System.out.println("Numero Cuenta: " + getNum_Cuenta());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Monto: " + getMonto());
    }
}
