package mgarcia;

public abstract class alumno {
	
	private String nombre;
	private int edad;
	private String localidad;
	private int sanciones;
	
	public alumno(String nombre) {
		this.nombre=nombre;
		this.sanciones=0;
	}
	
	public alumno(String nombre,int edad) {
		this(nombre);
		this.edad=edad;
	}
	
	public alumno(String nombre,int edad,String localidad) {
		this(nombre,edad);
		this.localidad=localidad;
	}
	
	public abstract int media();
	
	public void sancionar(profesor p) {
		this.sanciones+=1;
		p.sanciones+=1;
		if(this.sanciones%3==0) System.out.println(this.nombre + " al aula de Castigo!");
		if(this.sanciones%5==0) System.out.println(this.nombre + " mañana le visita el inspector!");
	}
}
