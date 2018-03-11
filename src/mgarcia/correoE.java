package mgarcia;

import java.util.Scanner;

public class correoE {
	private String asunto;
	private String cuerpo;
	
	public correoE() {
		this.asunto="";
		this.cuerpo="";
	}
	
	public correoE(String asunto,String cuerpo) {
		this.asunto=asunto;
		this.cuerpo=cuerpo;
	}
	
	public void escribirCorreo() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe un asunto: ");
		this.asunto = sc.nextLine();
		System.out.println("Escribe un mensaje: ");
		this.cuerpo = sc.nextLine();
	}
	
	public void mostrarCorreo() {
		System.out.println("Asunto: " + this.asunto);
		System.out.println("Mensaje: " + this.cuerpo);
	}

	public String getAsunto() {
		return asunto;
	}

	public String getCuerpo() {
		return cuerpo;
	}
}
