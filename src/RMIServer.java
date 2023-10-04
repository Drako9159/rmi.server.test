import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements MiInterface {
    @Override
    public String metodo(String input) throws RemoteException {
        System.out.println("Tu entrada " + input + " fue enviada al servidor");
        String respuesta;
        respuesta = "Hola " + input;
        return respuesta;

    }

    public RMIServer() throws RemoteException {
        System.out.println("El servidor está en ejecución...");
    }

    public static void main(String[] args) {
        try {
            RMIServer server = new RMIServer();
            Naming.rebind("rmiInterface", server);
        } catch (Exception e) {
            System.out.println("Excepción " + e.getMessage());
        }
    }


}
