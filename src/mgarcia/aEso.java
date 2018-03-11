package mgarcia;

public class aEso extends alumno{
	
	int notaPlastica;
	int notaCiudadania;
	int notaLengua;
	
	public aEso(String nombre,int edad,String localidad,int notaPlastica,int notaCiudadania,int notaLengua) {
		super(nombre,edad,localidad);
		this.notaPlastica=notaPlastica;
		this.notaCiudadania=notaCiudadania;
		this.notaLengua=notaLengua;
	}
	
	public int media() {
		return (this.notaPlastica + this.notaCiudadania + this.notaLengua)/3;
	}
	
}	
