package views;

public class CombinationView extends View {

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
    
}
