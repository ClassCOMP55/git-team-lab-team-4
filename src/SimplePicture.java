import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.png", 200, 100);
		add(robot);
		GLabel label = new GLabel("How Team 4 may feel when using github!", 200, 500);
		add(label);
		GLine line = new GLine(300, 300, 600, 300);
		add(line);
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}