import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class HelloLoad extends UnicastRemoteObject implements Hello {
    public HelloLoad() throws RemoteException {}

    public String digaHello() throws RemoteException {
        return "Hello, world!";
    }
}
