package Server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class Früherkennung implements FrüherkennungIF {
    @Override
    public Bericht analysieren(Röntgenbild r) throws RemoteException {
        System.out.println("ping");
        return new Bericht(new Date(System.currentTimeMillis()),"Du hast kein Krebs","iss weniger Zucker!!!");

    }
    public static void main(String args[]){
        try {
            FrüherkennungIF f = new Früherkennung();
            FrüherkennungIF stub = (FrüherkennungIF) UnicastRemoteObject.exportObject(f, 0);

            Registry r = LocateRegistry.createRegistry(1099);

            r.bind("FrüherkennungsStub", f);


        }
        catch (RemoteException | AlreadyBoundException e){
            e.printStackTrace();
        }
    }

}
