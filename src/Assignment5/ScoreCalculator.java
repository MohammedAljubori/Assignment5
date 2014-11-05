package Assignment5;

public class ScoreCalculator {

	public static double calScore(int[] score, double[] weight) {
		double avgScore = 0;
		double totalScore = 0;
		for (int i = 0; i < score.length; i++) {
			totalScore += score[i] * weight[i];
		}
		avgScore = totalScore / score.length;
		return avgScore;
	}
}

