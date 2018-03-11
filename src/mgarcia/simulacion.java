package mgarcia;

public class simulacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		correoE email = new correoE("hola","adios");
		buzon pepe = new buzon("pepe");
		buzon fran = new buzon("fran");
		pepe.enviarMensaje(email, fran);
		fran.leerCorreo();
	}

}
