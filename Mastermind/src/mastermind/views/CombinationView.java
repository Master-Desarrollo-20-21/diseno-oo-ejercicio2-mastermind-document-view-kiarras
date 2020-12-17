package views;

import utils.Error;
import models.Game;
import models.ProposedCombination;

public class CombinationView extends ConsoleView {

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
	private String inProposedCombination(String value,Error validCombination) {
		if(validCombination == Error.ERRORLENGHT)
			return inProposedCombination(StringsViews.WRONG_LENGTH.getMessage());
		if(validCombination == Error.ERRORCOLOR)
			return inProposedCombination(StringsViews.WRONG_COLORS.getMessage());
		return value;
	}

	public void addNewAttempt(int i) {
        this.game.addNewAttempt(i,getProposedCombination());
	}

	private ProposedCombination getProposedCombination() {
		ProposedCombination proposedCombination = new ProposedCombination();
		String value = inProposedCombination("");
		
		while(proposedCombination.isValidCombination(value)!= Error.NOERROR){
			value = inProposedCombination(value, proposedCombination.isValidCombination(value));
		}
		proposedCombination.setCombination(value);
        return proposedCombination;
    }


}
