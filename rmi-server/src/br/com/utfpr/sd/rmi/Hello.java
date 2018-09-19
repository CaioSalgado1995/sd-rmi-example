package br.com.utfpr.sd.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Hello extends UnicastRemoteObject implements IHello {

	private static final long serialVersionUID = 5209283735014683364L;
	
	protected Hello() throws RemoteException {
		super();
	}

	@Override
	public void requestHello(String name, ClientHelloWorld interfaceCli) throws RemoteException {
		System.out.println("Enviando mensagem para o cliente " + name);
		interfaceCli.printHello("Hello word " + name);
	}

}
