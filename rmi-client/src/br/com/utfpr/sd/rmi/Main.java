package br.com.utfpr.sd.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

	public static void main(String[] args) {
		IHello iHello = null;
		
		try {
			ClientHelloWorld interfaceCliente = new ClientHelloWorldImpl();
			Registry names = LocateRegistry.getRegistry(1099);
			iHello = (IHello) names.lookup("IHello");
			iHello.requestHello("Caio", interfaceCliente);
		} catch (RemoteException | NotBoundException e) {
			System.out.println("Erro no cliente");
		}
	}

}
