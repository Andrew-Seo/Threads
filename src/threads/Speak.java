package threads;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Speak implements KeyListener {
	//
	
	static String x;
	static boolean y = false;
	
	public static void main(String[] args) {
		new Speak();
		new Thread(() -> speak("What word do you want me to say?")).start();
		x = JOptionPane.showInputDialog("What word do you want me to say?");
		while(true){
			speak(x);
			if(y == true){
				System.exit(0);
			}
		}
		
	}
	public Speak() {
		// TODO Auto-generated constructor stub
		JFrame h = new JFrame();
		h.setVisible(true);
		h.addKeyListener(this);
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("s");
		if(e.getKeyCode() == e.VK_0){
			
			y= true;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
