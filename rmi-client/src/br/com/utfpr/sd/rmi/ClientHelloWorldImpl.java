package br.com.utfpr.sd.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientHelloWorldImpl extends UnicastRemoteObject implements ClientHelloWorld {

	private static final long serialVersionUID = -6983810171708942451L;
	
	protected ClientHelloWorldImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printHello(String message) throws RemoteException {
		System.out.println(message);
	}

}
