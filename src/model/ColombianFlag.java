package model;

public class ColombianFlag {
	
    private String color;
    private int vertical;
    private int horizontal;
    private int savePosition;
    private int width;
    private int height;
	

    
	public ColombianFlag(String color, int vertical, int horizontal, int savePosition, int width, int height) {
		this.color = color;
		this.vertical = vertical;
		this.horizontal = horizontal;
		this.savePosition = savePosition;
		this.width = width;
		this.height = height;
	}
	public void setVerticalPosition() {
		this.vertical = savePosition;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVertical() {
		return vertical;
	}

	public void setVertical(int vertical) {
		this.vertical++;
	}

	public int getHorizontal() {
		return horizontal;
	}

	public void setHorizontal() {
		this.horizontal++;
	}

	public int getSavePosition() {
		return savePosition;
	}

	public void setSavePosition(int savePosition) {
		this.savePosition = savePosition;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}	
}
