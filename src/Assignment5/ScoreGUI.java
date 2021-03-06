package Assignment5;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class ScoreGUI extends JFrame implements ActionListener {
	
	/**
	 * @author MohammedAljubori
	 * 8/28/2014
	 * Purpose: student inputs scores and weights of assignments and program calculates score in GUI
	 */
	
	JTextField[] jtxtScore = new JTextField[4];
	JTextField[] jtxtWeight = new JTextField[4];
	JButton jbtnCalScore = new JButton("Calcuate Score");
	JPanel jpnlScore = new JPanel(new GridLayout(5, 2));
	JTextField jtxtDisplay = new JTextField();
	JLabel label1 = new JLabel("Score");
	JLabel label2 = new JLabel("Weight");
	JLabel[] label = new JLabel[10];
	int[] score = new int[4];
	double[] weight = new double[4];

	/**
	 * Creates ScoreGUI, which displays the values in the GUI
	 */
	public ScoreGUI() {
		for (int i = 0; i < jtxtScore.length; i++) {
			jtxtScore[i] = new JTextField(6);
			jtxtWeight[i] = new JTextField(6);
			jpnlScore.add(jtxtScore[i]);
			jpnlScore.add(jtxtWeight[i]);
		}
		
		/**
		 * Create border layouts and places objects inside
		 */
		jbtnCalScore.addActionListener(this);
		add(jtxtDisplay, BorderLayout.NORTH);
		jpnlScore.add(label1, BorderLayout.CENTER);
		jpnlScore.add(label2, BorderLayout.CENTER);
		add(jpnlScore);
		add(jbtnCalScore, BorderLayout.SOUTH);
		setVisible(true);
		pack();
	}
	/**
	 * Displays the final score in the northern text field
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		for (int i = 0; i < score.length; i++) {
			score[i] = Integer.parseInt(jtxtScore[i].getText());
			weight[i] = Double.parseDouble(jtxtWeight[i].getText());
		}
		jtxtDisplay.setText(ScoreCalculator.calScore(score, weight) + "");
	}

	public static void main(String[] args) {
		new ScoreGUI();
	}
}
