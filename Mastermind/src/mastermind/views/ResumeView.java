package views;

public class ResumeView extends ConsoleView {

    public boolean isResumed() {
        console.out(StringsViews.ASKRESUME.getMessage());
        return console.inString().equals("y");
    }
}
