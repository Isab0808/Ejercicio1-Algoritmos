import java.util.ArrayList;

import processing.core.PApplet;

public class Principal extends PApplet{

	public static void main(String[] args) {
		PApplet.main("Principal");
	}

	@Override
	public void settings() {
		size(500,500);
	}	
	//LLamando a la clase
	private Cuadrado cuadrado;
		
	//Creando el Arraylist
	public ArrayList<Cuadrado>listaCuadrados;
	
	@Override
	public void setup() {
	//Inicializo el arraylist
		listaCuadrados = new ArrayList<>();
		
	//Para que el mouse coja el cuadrado desde el centro
		rectMode(CENTER);
		
		frameRate(60);
	}
	
	@Override
	public void draw() {
		background (255);
		
		a�adirCuadrados();
		dibujarCuadrados();
	}
	
	private void dibujarCuadrados () {
		for (int i = 0; i < listaCuadrados.size(); i++) {
			listaCuadrados.get(i).pintar(this);
		}
	}
	
	private void a�adirCuadrados() {
		if (frameCount == 60) {
			int tama�o = (int) random(30, 60);
			int posicionX = (int) random(50, 450);
			listaCuadrados.add(new Cuadrado(posicionX, -50, tama�o, this));
			frameCount = 0;
		}
	}
	
	@Override
	public void mousePressed() {
		clicCuadrados();
	}
	
	private void clicCuadrados() {
		for (int i = 0; i < listaCuadrados.size(); i++) {
			if (mouseX > (listaCuadrados.get(i).getPosicionX() - (listaCuadrados.get(i).getTama�o() / 2)) && 
				mouseX < (listaCuadrados.get(i).getPosicionX() + (listaCuadrados.get(i).getTama�o() / 2)) && 
				mouseY > (listaCuadrados.get(i).getPosicionY() - (listaCuadrados.get(i).getTama�o() / 2)) && 
				mouseY < (listaCuadrados.get(i).getPosicionY() + (listaCuadrados.get(i).getTama�o() / 2))) {
				listaCuadrados.get(i).setmover(!listaCuadrados.get(i).estadoCuadrado());
				}
			}
	}
}
