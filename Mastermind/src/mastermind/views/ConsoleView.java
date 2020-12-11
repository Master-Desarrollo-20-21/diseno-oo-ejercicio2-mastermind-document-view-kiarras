package views;
import utils.Console;

public abstract class ConsoleView {
    
    Console console;
    protected ConsoleView(){
        this.console = new Console();
    }
}
