package br.com.utfpr.sd.rmi;

import java.rmi.Remote;

public interface ClientHelloWorld extends Remote {

	void printHello(String message);
}
