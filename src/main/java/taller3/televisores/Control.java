package taller3.televisores;

public class Control {
	TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}

	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
		
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();	
		
	}
	public void setVolumen(int volumen) {
		if (volumen >=0 && volumen >= 7 && tv.estado == true) {
			tv.volumen = volumen;
		}
	}
	public void canalUp() {
		if (tv.canal >= 1 && tv.canal <120 && tv.estado == true) {
			tv.canal++;
		}
	}
	
	public void canalDown() {
		if (tv.canal > 1 && tv.canal <=120 && tv.estado == true) {
			tv.canal--;
		}
	}
	
	public void volumenUp() {
		if (tv.volumen >= 1 && tv.volumen <7 && tv.estado == true) {
			tv.volumen++;
		}
	}
	
	public void volumenDown() {
		if (tv.volumen > 1 && tv.volumen <=7 && tv.estado == true) {
			tv.volumen--;
		}
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public TV getTv() {
			return tv;
	}	
	
}
