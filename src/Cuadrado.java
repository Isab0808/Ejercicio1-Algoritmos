import processing.core.PApplet;

public class Cuadrado {
	private int posicionX;
	private int posicionY;
	private int tama�o;
	private int llego;
	
	private int r,g,b;
	
	private boolean estadoCuadrado;
	
	public Cuadrado(int posicionX, int posicionY, int tama�o, PApplet app) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.tama�o = tama�o;
		
		r = (int)(Math.random()*255);
		g = (int)(Math.random()*200);
		b = (int)(Math.random()*200);
		
		estadoCuadrado = true;
		
		llego = 0;
	}
	
	public void pintar (PApplet app) {
		app.fill(r,g,b);
		app.rect(posicionX, posicionY, tama�o, tama�o);
		mover();
	}
	
	public void mover () {
		if (estadoCuadrado == true) {
			if (llego == 0) {
			posicionY += 3 ;
			if (posicionY == 490) {
				llego = 1;
			}
		}}
		
		if (estadoCuadrado == true) {
			if (llego == 1) {
			posicionY -= 3 ;
			if (posicionY == 14) {
				llego = 0;
			}
		}}
		}

	public int getPosicionX() {
		return posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public int getTama�o() {
		return tama�o;
	}
	
	public void setmover(boolean estadoCuadrado) {
		this.estadoCuadrado = estadoCuadrado;
		
	}
	public boolean estadoCuadrado() {
		return estadoCuadrado;
	}
}
