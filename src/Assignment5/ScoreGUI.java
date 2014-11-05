package assignment5;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class ScoreGUI extends JFrame implements ActionListener {
	
	JTextField[] jtxtScore = new JTextField[4];
	JTextField[] jtxtWeight = new JTextField[4];
	JButton jbtnCalScore = new JButton("Calcuate Score");
	JPanel jpnlScore = new JPanel(new GridLayout(5, 2));
	
	JTextField jtxtDisplay = new JTextField();
	JLabel label1 = new JLabel("Score");
	JLabel label2 = new JLabel("Weight");
	
	int[] score = new int[4];
	double[] weight = new double[4];
	
	public ScoreGUI() {
		for (int i = 0; i < jtxtScore.length; i++) {
			jtxtScore[i] = new JTextField(6);
			jtxtWeight[i] = new JTextField(6);
			jpnlScore.add(jtxtScore[i]);
			jpnlScore.add(jtxtWeight[i]);
		}
		jbtnCalScore.addActionListener(this);
		add(jtxtDisplay, BorderLayout.NORTH);
		add(jpnlScore, BorderLayout.CENTER);
		jpnlScore.add(label1, BorderLayout.CENTER); 
		jpnlScore.add(label2, BorderLayout.CENTER);
		add(jbtnCalScore, BorderLayout.SOUTH);
		setVisible(true);
		pack();
	}
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
