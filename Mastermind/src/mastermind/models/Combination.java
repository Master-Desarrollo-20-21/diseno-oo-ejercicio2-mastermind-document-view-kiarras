package models;

import java.util.List;

import utils.Color;

public abstract class Combination {
    protected static final int MAX_COLORS = 4;
    protected String code;
    protected char[] charCode = new char[MAX_COLORS];
    protected List<Color> colors;
    
    public abstract String getCombination();
    
}
