import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MiInterface extends Remote {
    public String method(String input) throws RemoteException;
}
