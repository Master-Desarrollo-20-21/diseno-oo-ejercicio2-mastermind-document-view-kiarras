package models;

import utils.Error;
import utils.Color;

public class ProposedCombination extends Combination {

    public Error isValidCombination(String value) {

		if (value.length() != MAX_COLORS) {
            return Error.ERRORLENGHT;
        } 
        if (!isColorsOK(value)) {
            return Error.ERRORCOLOR;
        }
        return Error.NOERROR;
    }
	private boolean isColorsOK(String value) {
        for (char c : value.toCharArray()) {
                if(Color.valueOf(c) == null) return false;
            }
        return true;
    }


    public ProposedCombination getProposedCombination() {
		return this;
	}

    @Override
    public String getCombination() {
        return code;
    }

	public void setCombination(String value) {
        code = value;
	}
}
