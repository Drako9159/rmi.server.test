import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;

public class RMICliente {
    public static void main(String[] args) {
        {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                MiInterface s = (MiInterface) Naming.lookup("rmiInterface");
                System.out.println("Escribe tu nombre ...");
                String input = br.readLine();
                System.out.println(s.method(input));
            } catch (Exception e) {
                System.out.println("Exception " + e.getMessage());
            }
        }
    }
}
