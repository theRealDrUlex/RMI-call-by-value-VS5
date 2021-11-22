package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FrüherkennungIF extends Remote {
    public Bericht analysieren(Röntgenbild r) throws RemoteException;
}
