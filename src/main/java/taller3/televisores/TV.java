package taller3.televisores;

public class TV {
	private static int numTV=0;
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;

public TV(Marca marca,boolean estado) {
	this.marca=marca;
	this.estado=estado;
	TV.numTV++;
}

public Marca getMarca() {
	return marca;
}
public void setMarca(Marca marca) {
	this.marca=marca;
}

public int getCanal() {
	return canal;
}
public void setCanal(int canal) {
	if (canal>=1 && canal<=120) {
		this.canal=canal;
	}else {
		return;
	}
}

public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio=precio;
}

public int getVolumen() {
	return volumen;
}
public void setVolumen(int volumen) {
	if (volumen>=0 && volumen<=7) {
		this.volumen=volumen;
	}else {
		return;
	}
}

public Control getControl() {
	return control;
}
public void setControl(Control control) {
	this.control=control;
}

public static int getNumTV() {
	return TV.numTV;
}
public static void setNumTV(int num) {
	TV.numTV=num;
}

public void turnOn() {
	estado=true;
	canal=1;
	volumen=1;
}
public void turnOff() {
	estado=false;
}

public boolean getEstado() {
	return estado;
}

public void canalUp() {
	if(estado==true && canal>=1 && canal<120) {
		canal++;
	}else {
		return;
	}
}

public void canalDown() {
	if(estado==true && canal>1 && canal<=120) {
		canal--;
	}else {
		return;
	}
}

public void volumenUp() {
	if(estado==true && volumen>=0 && volumen<7) {
		volumen++;
	}else {
		return;
	}
}

public void volumenDown() {
	if(estado==true && volumen>0 && volumen<=7) {
		volumen--;
	}else {
		return;
	}
}

}