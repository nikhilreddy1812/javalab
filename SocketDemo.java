import java.net.*;
class SocketDemo {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        Thread client = new Thread(() -> {
            try {
                Socket s = new Socket("localhost", 5000);
                System.out.println("Client connected to server");
                s.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        });
        client.start();
        Socket s = server.accept();
        System.out.println("Server accepted client");
        s.close();
        server.close();
    }
}
