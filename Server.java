import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements SumService {

    protected Server() throws RemoteException {
        super();
    }

    public int sum(int a, int b) throws RemoteException {
        return a + b;
    }

    public static void main(String[] args) {
        try {
            Server server = new Server();
            Naming.rebind("rmi://localhost:1099/SumService", server);
            System.out.println("Servidor RMI está pronto.");
        } catch (Exception e) {
            System.out.println("Erro no servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
