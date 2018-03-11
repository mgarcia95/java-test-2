package mgarcia;

public class aBachilleratoArtes extends aBachillerato{
	int notaDibujo;
	
	public aBachilleratoArtes(String nombre,int edad,String localidad,int notaMatematicas,int notaIngles,int notaSelectividad,int notaDibujo){
		super(nombre,edad,localidad,notaMatematicas,notaIngles,notaSelectividad);
		this.notaDibujo=notaDibujo;
	}
	
	public int media() {
		return (this.notaMatematicas + this.notaIngles + this.notaSelectividad + this.notaDibujo)/4;
	}
}