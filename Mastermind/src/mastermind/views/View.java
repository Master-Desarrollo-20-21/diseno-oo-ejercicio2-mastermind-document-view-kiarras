package views;

import models.Game;

public class View {
    protected Game game;
    private GameView gameView;
    private CombinationView combinationView;

	public View(Game game) {
        this.game = game;
        this.gameView = new GameView(this.game);
        this.combinationView = new CombinationView(this.game);
	}

    public boolean isResumed() {
        if(new ResumeView().isResumed()){
            this.game = new Game();
            return true;
        }
        return false;
    }

	public void play() {
        this.gameView.showTitle();
        int i = 0;
        do {
            this.gameView.showAttempsNumber(i);
            this.gameView.showPreviousAttempts(this.game.previousAttempts(i));
            combinationView.addNewAttempt(i);
            i++;
            if (this.game.results[i - 1][0] == this.game.WINS) {
                break;
            }
        } while (i < this.game.proposedCombinations.length);
        this.gameView.finalResult(this.game.finalResult(i - 1));
	}


}
