package views;

public class ResumeView extends View {

    public boolean isResumed() {
        console.out("Resume? (y/n):");
        return console.inString().equals("y");
    }
}
