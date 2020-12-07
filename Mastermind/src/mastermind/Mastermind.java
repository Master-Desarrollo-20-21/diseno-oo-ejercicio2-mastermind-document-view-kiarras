
import models.Game;
import views.ResumeView;

public class Mastermind {

    private Game game;

    public Mastermind(){
        this.game = new Game();
    }

    private void start() {
        do {
            this.game.play();
        } while (isResumed());
    }
    
    private boolean isResumed() {
        if(new ResumeView().isResumed()){
            this.game = new Game();
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
            new Mastermind().start();
    }
}
