package views;

import models.Game;

public class CombinationView extends View {

    private Game game;

    public CombinationView(Game game) {
        this.game = game;
	}

	public CombinationView() {
	}

	public String inProposedCombination(String alert) {
        console.out(alert);
        console.out(StringsViews.PROPOSE.getMessage());
        return console.inString();
    }

	public String inWrongLength() {
		return inProposedCombination(StringsViews.WRONG_LENGTH.getMessage());
	}

	public String inWrongColors() {
		return inProposedCombination(StringsViews.WRONG_COLORS.getMessage());
    }

	public void addNewAttempt(int i) {
        this.game.addNewAttempt(i);
	}
    
}
