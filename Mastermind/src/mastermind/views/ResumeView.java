package views;

public class ResumeView extends View {

    public boolean isResumed() {
        console.out(StringsViews.ASKRESUME.getMessage());
        return console.inString().equals("y");
    }
}
