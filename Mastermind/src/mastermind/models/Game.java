package models;

public class Game {

    public static final int MAX_ATTEMPS = 10;
    public static final int WINS = 4;
    private ProposedCombination[] proposedCombinations;
    private SecretCombination secretCombination;
    private int[][] results;

    public Game() {
        proposedCombinations = new ProposedCombination[MAX_ATTEMPS];
        results = new int[MAX_ATTEMPS][];
    }

    public String[] previousAttempts(int previous) {
        String[] attempts = new String[previous];
        for (int j = 0; j < previous; j++) {
            attempts[j]=getAttempt(j);
        }
        return attempts;
    }

    public String getAttempt(int j) {
        return proposedCombinations[j].getCombination() + " --> " + results[j][0] + " blacks and " + results[j][1] + " whites";
    }

    public boolean finalResult(int i) {
        return results[i][0] == WINS;
    }

	public boolean getResult() {
		return false;
	}

	public void addNewAttempt(int i, ProposedCombination proposedCombination) {
        proposedCombinations[i] = proposedCombination;
        results[i] = secretCombination.isEqual(proposedCombinations[i].getProposedCombination().getCombination());
    }
    
    public boolean isFinished(int i) {
        return i >= MAX_ATTEMPS || finalResult(i-1);
    }

	public void newSecretCombination() {
        secretCombination = new SecretCombination();
	}
}
