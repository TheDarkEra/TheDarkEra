package com.thedarkera.score;


public class ScoreStat {

	private static int totalScore;
	private static int maxScore = 1; // TODO

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
