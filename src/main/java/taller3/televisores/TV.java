package taller3.televisores;

public class TV {
	public static void main(String[] args) {
	}
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	public static int numTV; 
	
	/*constructor*/
	public TV(Marca marca,Boolean estado) {
		this.marca = marca;
		this.estado = estado;
		TV.numTV ++;
	}
 /*get and set*/  /* marca, control, precio, volumen y canal*/
	
	public void turnON() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	
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
		this.precio = precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		if(this.estado == true && volumen >= 0 && volumen <= 7){
		this.volumen = volumen;
		}
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if(this.estado == true  && canal >=1  && canal <=120) {
		this.canal = canal;	
		}
		 
	}

}
