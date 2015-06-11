package com.thedarkera.api.systems.scoring;


public class ScoreStat {

	private static int totalScore;
	private static int maxScore = 25; // Every time a achievement is added, add to this.
	private static int addedScore;
	
	public static void addScore(int addScore) {
		totalScore = totalScore + addScore;
		addedScore = addScore;
		System.out.println("ScoreSystem: " + "Current Amount of added score is - " + addedScore);
	}
	
	public static int getScore() {
		return totalScore;
	}
	
	public static int getMaxScore() {
		return maxScore;
	}
}