package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] r = new Robot[8];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < r.length; i++) {
			r[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		int roboX = 50;
		for (int i = 0; i < r.length; i++) {
			r[i].setX(roboX);
			r[i].setY(550);
			roboX += 100;
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random rand = new Random();

		for (int i = 0; i < r.length; i++) {
			r[i].setSpeed(15);
			r[i].move(rand.nextInt(50));
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		String rNum = "";
		while (true) {
			boolean isTop = false;
			
			for (int i = 0; i < r.length; i++) {
				r[i].move(rand.nextInt(50));
				
				if(r[i].getY()<=0) {
					isTop = true;
					rNum = String.valueOf(i+1);
				}
			}
			if (isTop) {
				break;
			}
		}

		// 7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "The Winner is Robot Number " + rNum + "!");
		System.exit(0);
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
