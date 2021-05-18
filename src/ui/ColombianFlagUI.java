package ui;

import model.ColombianFlag;
import thread.ColombianFlagThread;

public class ColombianFlagUI {
	
    public final static String ESC = "\u001b[";
	private final String yellow = "\u001b[43m";
	private final String blue = "\u001b[44m";
	private final String red = "\u001b[41m";
	private final int flagColors = 3;
	private ColombianFlagThread[] threadArray;
	private ColombianFlag[] flagArray;
	
	public ColombianFlagUI() {
		threadArray  = new ColombianFlagThread[flagColors];
		flagArray = new ColombianFlag[flagColors];
		initializeColor();
		initilalizeThread();
		
	}
    public void initProgram() {
        for (int i = 0; i < flagColors; i++) {
        	threadArray[i].start();
        }
    }

    public void initializeColor() {
    	flagArray[0] = new ColombianFlag("y", 0, 0, 0, 100, 10);
    	flagArray[1] = new ColombianFlag("b", 10, 0, 10, 100, 17);
    	flagArray[2] = new ColombianFlag("r", 17, 0, 17, 100, 22);
    }

    public void initilalizeThread() {
    	threadArray[0] = new ColombianFlagThread(flagArray[0], this, 10);
    	threadArray[1] = new ColombianFlagThread(flagArray[1], this, 30);
    	threadArray[2] = new ColombianFlagThread(flagArray[2], this, 50);
    }
    
    public void changeFlag(int horizontal, int vertical, String color) {

        if (color.equals("y")) {
            System.out.print(ESC + horizontal + "G" + ESC + vertical + "d" + yellow + " " + ESC);
        } else if (color.equals("b")) {
            System.out.print(ESC + horizontal + "G" + ESC + vertical + "d" + blue + " " + ESC);
        } else {
            System.out.print(ESC + horizontal + "G" + ESC + vertical + "d" + red + " " + ESC);
        }
    }
	public ColombianFlag[] getFlagArray() {
		return flagArray;
	}
	public void setFlagArray(ColombianFlag[] flagArray) {
		this.flagArray = flagArray;
	}
	public ColombianFlagThread[] getThreadArray() {
		return threadArray;
	}
	public void setThreadArray(ColombianFlagThread[] threadArray) {
		this.threadArray = threadArray;
	}
	public String getYellow() {
		return yellow;
	}
	public String getRed() {
		return red;
	}
	public String getBlue() {
		return blue;
	}
	
}
