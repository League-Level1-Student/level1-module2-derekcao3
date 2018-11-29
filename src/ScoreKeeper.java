public class ScoreKeeper {
	private int playerScore = 0;
	private int opponentScore = 0;
	private int gamesPlayed = 0;

	public ScoreKeeper(int playerScore, int opponentScore, int gamesPlayed) {
		super();
		this.playerScore = playerScore;
		this.opponentScore = opponentScore;
		this.gamesPlayed = gamesPlayed;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	public int getOpponentScore() {
		return opponentScore;
	}

	public void setOpponentScore(int opponentScore) {
		this.opponentScore = opponentScore;
	}

}
