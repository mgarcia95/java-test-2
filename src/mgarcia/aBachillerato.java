package mgarcia;

public abstract class aBachillerato extends alumno{
	
	int notaMatematicas;
	int notaIngles;
	int notaSelectividad;

	public aBachillerato(String nombre,int edad,String localidad,int notaMatematicas,int notaIngles,int notaSelectividad) {
		super(nombre,edad,localidad);
		this.notaMatematicas=notaMatematicas;
		this.notaIngles=notaIngles;
		this.notaSelectividad=notaSelectividad;
	}
	
	public abstract int media();
}
