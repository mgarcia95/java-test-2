package mgarcia;

public class aCiclo extends alumno{
	int notaBBDD;
	int notaPHP;
	int notaServicios;
	
	public aCiclo(String nombre,int edad,String localidad,int notaBBDD,int notaPHP,int notaServicios) {
		super(nombre,edad,localidad);
		this.notaBBDD=notaBBDD;
		this.notaPHP=notaPHP;
		this.notaServicios=notaServicios;
	}
	
	public int media() {
		return (this.notaBBDD + this.notaPHP + this.notaServicios)/3; 
	}
}
