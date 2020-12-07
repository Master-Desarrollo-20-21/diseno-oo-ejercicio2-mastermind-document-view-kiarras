package views;

public enum StringsViews {
    ASKRESUME ("Resume? (y/n):"),
    TITLE ("----- MASTERMIND ----- \n"),
    ATTEMPS(" attempt(s): \n xxxx \n"),
    WON("You've won!!! ;-) \n"),
    LOST("You've lost!!! :-( \n"),
    PROPOSE("Propose a combination: "),
    WRONG_LENGTH ("Wrong proposed combination length \n"),
    WRONG_COLORS ("Wrong colors, they must be: rbygop \n");
    
    private String keyword;
    StringsViews(String keyword) {
        this.keyword = keyword;
    }
    public String getMessage() {
	    return this.keyword;
    }
}
