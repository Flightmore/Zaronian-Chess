import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Chess {
	JFrame view;
	JButton[][] grid = new JButton[6][7];

	public void display(){
		view = new JFrame("Zaronian Chess");//custom jframe
		JPanel jp = new JPanel(new GridLayout(6,7));

		for(int i=0; i<6; i++){//array size?
			for (int j=0; j<7; j++){
				grid[i][j] = new JButton();
				jp.add(grid[i][j]);
				//btn[i][j].addActionListener(this);
			}
		}

		view.add(jp);
		view.setSize(700,600);
		view.setVisible(true);
	}

	public static void main (String[] args){
		(new Chess()).display();
	}
}