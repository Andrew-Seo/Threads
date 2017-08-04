package threads;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings.
	// One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot timmy = new Robot(400, 300);
		Robot tammy = new Robot(700, 300);
		Robot sammy = new Robot(1000, 300);
		Robot lammy = new Robot(550, 550);
		Robot fammy = new Robot(850, 550);

		timmy.setSpeed(10);
		tammy.setSpeed(10);
		sammy.setSpeed(10);
		lammy.setSpeed(10);
		fammy.setSpeed(10);

		new Thread(() -> drawCircle(timmy)).start();
		new Thread(() -> drawCircle(tammy)).start();
		new Thread(() -> drawCircle(sammy)).start();
		new Thread(() -> drawCircle(lammy)).start();
		new Thread(() -> drawCircle(fammy)).start();

	}

	static void drawCircle(Robot r) {
		r.penDown();
		for (int i = 0; i < 360; i++) {
			r.turn(1);
			r.move(3);
		}
		
		r.penUp();
		r.turn(90);
		r.move(2000);
	}
}
