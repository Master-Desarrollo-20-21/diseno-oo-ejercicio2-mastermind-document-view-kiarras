package views;

import models.Game;

public class View {
    protected Game game;
    private GameView gameView;
    private CombinationView combinationView;

    public boolean isResumed() {
        return new ResumeView().isResumed();
    }

	public void play(Game game) {
        setGame(game);
        this.gameView.showTitle();
        int i = 0;
        do {
            this.gameView.showAttempsNumber(i);
            this.gameView.showPreviousAttempts(this.game.previousAttempts(i));
            this.combinationView.addNewAttempt(i);
            i++;
        } while (!this.game.isFinished(i));
        this.gameView.finalResult(this.game.finalResult(i - 1));
	}

    private void setGame(Game game) {
        this.game = game;
        this.game.newSecretCombination();
        this.gameView = new GameView(this.game);
        this.combinationView = new CombinationView(this.game);
    }
}
