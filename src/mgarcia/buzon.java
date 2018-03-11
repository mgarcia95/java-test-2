package mgarcia;

public class buzon {
	
	private String nombre;
	private correoE mensaje;
	private correoE papelera;
	private int numeroRecibidos;
	private int numeroEnviados;
	
	public buzon (String nombre) {
		this.nombre=nombre;
		this.mensaje=null;
		this.papelera=null;
		this.numeroEnviados=0;
		this.numeroRecibidos=0;
	}
	
	public void enviarMensaje(correoE mensaje,buzon destinatario) {
		boolean virus=false;
		for(int i=0;i<mensaje.getAsunto().length();i++) {
			if(mensaje.getAsunto().charAt(i)<'A' || mensaje.getAsunto().charAt(i)>'z' && !virus) {
				virus=true;
			}
		}
		if(!virus) {
			destinatario.mensaje=mensaje;
			System.out.println(destinatario.nombre + " tienes un mensaje de " + this.nombre);
			this.numeroEnviados+=1;
			destinatario.numeroRecibidos+=1;
			if(this.numeroEnviados%5==0) System.out.println(this.nombre + " estarás mandando spam?");
			this.papelera=this.mensaje;
		}
	}
	
	public void leerCorreo() {
		this.mensaje.mostrarCorreo();
	}
	
	public void vaciarPapelera() {
		this.papelera=null;
	}
	
	public void recuperarPapelera() {
		this.mensaje=this.papelera;
		this.papelera=null;
	}
 }
