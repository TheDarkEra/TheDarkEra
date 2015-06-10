package com.thedarkera.score;


public class ScoreStat {

	private static int totalScore;
	private static int maxScore = 25; // Every time a achievement is added, add this.

	public static void addScore(int addScore) {
		totalScore = totalScore + addScore;
	}
	
	public static int getScore() {
		return totalScore;
	}
	
	public static int getMaxScore() {
		return maxScore;
	}
	
	

}
