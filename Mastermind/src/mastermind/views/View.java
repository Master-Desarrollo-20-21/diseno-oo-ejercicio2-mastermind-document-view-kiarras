package views;

import models.Game;

public class View {
    Console console;
    private Game game;

    public View() {
        this.console = new Console();
    }

	public View(Game game) {
        this.game = game;
	}

    public boolean isResumed() {
        if(new ResumeView().isResumed()){
            this.game = new Game();
            return true;
        }
        return false;
    }

	public void play() {
        this.game.play();
	}


}
