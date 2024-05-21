import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            SumService service = (SumService) Naming.lookup("rmi://localhost:1099/SumService");
            int result = service.sum(5, 3);
            System.out.println("Resultado da soma: " + result);
        } catch (Exception e) {
            System.out.println("Erro no cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
