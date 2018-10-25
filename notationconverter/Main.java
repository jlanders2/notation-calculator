import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame("TEST");
		TestPanel panel = new TestPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
