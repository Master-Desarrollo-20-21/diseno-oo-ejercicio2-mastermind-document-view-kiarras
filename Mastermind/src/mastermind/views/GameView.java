package views;

public class GameView extends View {
    public void showTitle() {
        console.out(StringsViews.TITLE.getMessage());
    }
    public void showAttempsNumber(int i) {
        console.out(i + StringsViews.ATTEMPS.getMessage());
    }

    public void finalResult(Boolean result) {
        if (result) {
            console.out(StringsViews.WON.getMessage());
        } else {
            console.out(StringsViews.LOST.getMessage());
        }
    }

	public void showPreviousAttempts(String[] showPreviousAttempts) {
        for (int i = 0; i < showPreviousAttempts.length; i++) {
            console.out(showPreviousAttempts[i] + "\n");
        }
    }
    
}
