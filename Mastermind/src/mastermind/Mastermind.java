
import models.Game;
import views.View;

public class Mastermind {

    protected Game game;
    private View view;

    public Mastermind(){
        this.game = new Game();
        this.view = new View(this.game);
    }

    private void start() {
        do {
            this.view.play();
        } while (this.view.isResumed());
    }

    public static void main(String[] args) {
            new Mastermind().start();
    }
}
