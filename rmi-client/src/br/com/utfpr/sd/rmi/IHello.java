package br.com.utfpr.sd.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHello extends Remote {

	void requestHello(String name, ClientHelloWorld interfaceCli) throws RemoteException;
}
