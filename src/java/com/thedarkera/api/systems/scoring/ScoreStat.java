package com.thedarkera.api.systems.scoring;

public class ScoreStat {

	private static double totalScore;
	private static double maxScore = 25; // Every time a achievement is added, add to this.
	private static double addedScore;
	private static double scorePercentage;

	public static void addScore(double addScore) {
		totalScore = totalScore + addScore;
		addedScore = addScore;
		scorePercentage = totalScore / maxScore * 100;
		scorePercentage = Math.round(scorePercentage * 100) / 100;
		System.out.println("ScoreSystem: " + "Current Amount of added score is - " + addedScore);
	}

	public static double getScore() {
		return totalScore;
	}

	public static double getMaxScore() {
		return maxScore;
	}

	public static double getScorePercentage() {
		return scorePercentage;
	}

	/**
	 * Achievement Score TODO: 
	 * Change to if achievement = achieved addScore(1)
	 * Improve Score display
	 */
}
