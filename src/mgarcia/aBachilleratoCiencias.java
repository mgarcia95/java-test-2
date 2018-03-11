package mgarcia;

public class aBachilleratoCiencias extends aBachillerato{
	int notaFisica;
	
	public aBachilleratoCiencias(String nombre,int edad,String localidad,int notaMatematicas,int notaIngles,int notaSelectividad,int notaFisica){
		super(nombre,edad,localidad,notaMatematicas,notaIngles,notaSelectividad);
		this.notaFisica=notaFisica;
	}
	
	public int media() {
		return (this.notaMatematicas + this.notaIngles + this.notaSelectividad + this.notaFisica)/4;
	}
}
