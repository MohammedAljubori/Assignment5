package Assignment5;

public class ScoreCalculator {

	/**
	 * @author MohammedAljubori
	 * 8/28/2014
	 * This is the main class file for this assignment.
	 */
	
	
	/**
	 * @param score Create score array
	 * @param weight Create weight array
	 * @return The weighted average of the numbers
	 */
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
