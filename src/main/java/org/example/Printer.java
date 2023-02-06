package org.example;

public class Printer {
    int paperLeft;
    int toner;
    public Printer () {
        this.paperLeft = 25;
        this.toner = 100;
    }
    public int getPaperLeft () {
        return this.paperLeft;
    }
    public int getToner () { return this.toner; }
    public void setToner (int newToner) {
        this.toner = newToner;
    }
    public void print (int pages, int copies) {
        int totalSheets = pages * copies;
        if (totalSheets <= this.paperLeft && totalSheets <= this.toner) {
            this.paperLeft -= totalSheets;
            this.toner -= totalSheets;
        }
    }
}
