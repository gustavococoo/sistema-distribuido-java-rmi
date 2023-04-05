import java.rmi.*;
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
           String host = "localhost";
           Hello remobject = (Hello)Naming.lookup("rmi://"+ host + "/Hello");
           System.out.println(remobject.digaHello());
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
        catch (NotBoundException re) {
        	re.printStackTrace();
        }
        catch (MalformedURLException fe) {
        	fe.printStackTrace();
        }
    }
}
