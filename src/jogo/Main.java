package jogo;

import javax.swing.JOptionPane;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;


public class Main {
	
	public static void main(String[] args) {
		
		Window window = new Window(800, 600);
		GameImage gameImage = new GameImage(URL.sprite("menu.png"));
		Keyboard keyboard  = window.getKeyboard();
		
		while(true) {
			gameImage.draw();
			window.update();
			
			if(keyboard.keyDown(Keyboard.ENTER_KEY)) {
				new Cenario1(window);
			}
			
		}
		
	}

}
