package br.com.utfpr.sd.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientHelloWorld extends Remote {

	void printHello(String message) throws RemoteException;
}
