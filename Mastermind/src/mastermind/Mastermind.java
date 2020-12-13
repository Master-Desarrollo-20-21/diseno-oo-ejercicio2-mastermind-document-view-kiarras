
import models.Game;
import views.View;

public class Mastermind {

    protected Game game;
    private View view;

    public Mastermind(){
        this.game = new Game();
        this.view = new View();
    }

    private void start() {
        do {
            this.view.play(this.game);
        } while (this.view.isResumed());
    }

    public static void main(String[] args) {
            new Mastermind().start();
    }
}
