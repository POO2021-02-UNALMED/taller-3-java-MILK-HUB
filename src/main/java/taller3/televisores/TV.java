package televisores;

public class TV {

	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	public static int numTV; 
	
	/*constructor*/
	public TV(Marca marca,Boolean estado) {
	
	}
 /*get and set*/  /* marca, control, precio, volumen y canal*/
	
	public Marca getMarca(Marca marca) {
		return marca;
	}
	
	public void setMarca(Marca marca) {	
		this.marca = marca;
	}

	public Control getControl(Control control) {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getPrecio(int precio) {
		return precio;
	}
	
	public void setPrecio(int precio) {
		/*falta definir parametros*/
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		/*falta definir parametros*/
	}
	public int getCanal() {
		return canal;
	}
}


