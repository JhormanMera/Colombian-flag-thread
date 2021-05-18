package thread;
import model.ColombianFlag;
import ui.ColombianFlagUI;

public class ColombianFlagThread extends Thread{
	private ColombianFlag cf;
	private ColombianFlagUI cfui;
	private int sleep;

	public ColombianFlagThread(ColombianFlag cf, ColombianFlagUI cfui, int sleep) {
		this.cf = cf;
		this.cfui = cfui;
		this.sleep = sleep;
	}

	public ColombianFlag getCf() {
		return cf;
	}

	public void setCf(ColombianFlag cf) {
		this.cf = cf;
	}

	public ColombianFlagUI getCfui() {
		return cfui;
	}

	public void setCfui(ColombianFlagUI cfui) {
		this.cfui = cfui;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

	 @Override
	    public void run() {
	        setPosition();
	    }

	    public void setPosition() {
	        for (int i = 0; i < cf.getWidth(); i++) {
	            cf.setHorizontal();
	            for (int j = cf.getSavePosition(); j < cf.getHeight(); j++) {
	                cfui.changeFlag(cf.getHorizontal(), cf.getVertical(), cf.getColor());
	                cf.setVertical(i);
	                try {
	                    Thread.sleep(sleep);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	            cf.setVerticalPosition();
	        }
	    }
	}

