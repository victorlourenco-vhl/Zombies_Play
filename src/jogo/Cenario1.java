package jogo;

import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Cenario1 {
	
	private Window window;
	private Scene scene;
	
	public Cenario1(Window window) {
		this.window = window;
		this.scene = new Scene();
		this.scene.loadFromFile(URL.scenario("Cenario1.scn"));
		
		run();
	}
	
	private void run() {
		while(true) {
			scene.draw();
			window.update();
		}
	}

}
