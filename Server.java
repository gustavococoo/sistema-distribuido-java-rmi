import java.net.MalformedURLException;
import java.rmi.*;
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            HelloLoad localobj = new HelloLoad();
            Naming.rebind("rmi:///Hello", localobj);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
        catch (MalformedURLException fe) {
        	fe.printStackTrace();
        }
    }
}
