package dmacc.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game() {
		super();
	}
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getComputerPlayer() {
		return computerPlayer;
	}

	public void setComputerPlayer() {
		// Create ArrayList of choices
		List<String> choice = new ArrayList<String>();
		choice.add("rock");
		choice.add("paper");
		choice.add("scissors");
		choice.add("lizard");
		choice.add("spock");
		// Create randomIndex generator
		Random random = new Random();
		int randomIndex = random.nextInt(5);
		this.computerPlayer = choice.get(randomIndex);
		System.out.println(computerPlayer);
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	public void determineWinner() {
		// if statements to determine the winner.
		if(this.player1.equals("rock")) {
			if(this.computerPlayer.equals("rock")) {
				this.winner = "tie";
			}else if(this.computerPlayer.equals("paper")) {
				this.winner = "Computer";
			}else if(this.computerPlayer.equals("lizard")) {
				this.winner = "Player1";
			}else if(this.computerPlayer.equals("spock")) {
				this.winner = "Computer";
			}else {
				this.winner = "Player1";
			}
		}else if(this.player1.equals("paper")) {
			if(this.computerPlayer.equals("paper")) {
				this.winner = "tie";
			}else if(this.computerPlayer.equals("scissors")) {
				this.winner = "Computer";
			}else if(this.computerPlayer.equals("lizard")) {
				this.winner = "Computer";
			}else if(this.computerPlayer.equals("spock")) {
				this.winner = "Player1";
			}else {
				this.winner = "Player1";
			}
		}else if (this.player1.equals("scissors")) {
			if(this.computerPlayer.equals("scissors")) {
				this.winner = "tie";
			}else if(this.computerPlayer.equals("rock")) {
				this.winner = "Computer";
			}else if(this.computerPlayer.equals("lizard")) {
				this.winner = "Player1";
			}else if(this.computerPlayer.equals("spock")) {
				this.winner = "Computer";
			}else {
				this.winner = "Player1";
			}
		}else if (this.player1.equals("lizard")) {
			if(this.computerPlayer.equals("lizard")) {
				this.winner = "tie";
			}else if(this.computerPlayer.equals("rock")) {
				this.winner = "Computer";
			}else if(this.computerPlayer.equals("paper")) {
				this.winner = "Player1";
			}else if(this.computerPlayer.equals("spock")) {
				this.winner = "Player1";
			}else {
				this.winner = "Computer";
			}
		}else{
			if(this.computerPlayer.equals("spock")) {
				this.winner = "tie";
			}else if(this.computerPlayer.equals("rock")) {
				this.winner = "Player1";
			}else if(this.computerPlayer.equals("lizard")) {
				this.winner = "Computer";
			}else if(this.computerPlayer.equals("scissors")) {
				this.winner = "Player1";
			}else {
				this.winner = "Computer";
			}
		}
	}
}
