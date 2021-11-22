package Client;

import Server.Bericht;

import Server.FrüherkennungIF;
import Server.Röntgenbild;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class UniklinikRegensburg {

    public static void main(String args[]){
        Registry r = null;
        try {
            r = LocateRegistry.getRegistry("localhost", 1099);
            FrüherkennungIF uniklinik_server = (FrüherkennungIF) r.lookup("FrüherkennungsStub");
            Bericht antwort = uniklinik_server.analysieren(new Röntgenbild(new Date(System.currentTimeMillis()),"Hans",new byte[]{0,1,0,1}));
            System.out.println(antwort.toString());


        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }

    }


    public UniklinikRegensburg() throws RemoteException, NotBoundException {
    }

}
