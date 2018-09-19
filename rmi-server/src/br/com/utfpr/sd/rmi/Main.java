package br.com.utfpr.sd.rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

	public static void main(String[] args) {
		System.out.println("iniciando servidor ...");
		try {
			Registry names = LocateRegistry.createRegistry(1099);
			IHello iHello = new Hello();
			
			names.bind("IHello", iHello);
			System.out.println("Servidor pronto ... ");
		
		} catch (RemoteException e) {
			System.out.println("Erro ao inicializar o servidor ...");
		} catch (AlreadyBoundException e) {
			System.out.println("Erro ao fazer bind da referência ...");
		}
		
	
	}

}
