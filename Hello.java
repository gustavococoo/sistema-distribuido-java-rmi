import java.rmi.*;

public interface Hello extends Remote {
    public String digaHello() throws RemoteException;
}
