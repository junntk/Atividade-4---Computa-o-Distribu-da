public class Main {
    public static void main(String[] args) {
        try {
            // Simular a criação do servidor
            Server server = new Server();
            System.out.println("Servidor está pronto.");

            // Simular a chamada do cliente
            SumService service = server;
            int result = service.sum(5, 3);
            System.out.println("Resultado da soma: " + result);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
