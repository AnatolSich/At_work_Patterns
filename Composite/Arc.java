package Composite;

public class Arc implements Shape {
    int startX;
    int startY;
    int endX;
    int endY;
    int r;

    public Arc(int startX, int startY, int r) {
        this.startX = startX;
        this.startY = startY;
        this.r = r;
        this.endX = this.startX + r;
        this.endY = this.startY + r;
    }

    @Override
    public void move(int x,int y) {
        this.startX = x;
        this.startY = y;
        this.endX = this.startX + r;
        this.endY = this.startY + r;
    }

    @Override
    public int getStartX() {
        return this.startX;
    }

    @Override
    public int getStartY() {
        return this.startY;
    }

    @Override
    public int getEndX() {
        return this.endX;
    }

    @Override
    public int getEndY() {
        return this.endY;
    }

    @Override
    public void draw() {
        System.out.printf("Arc from (%d,%d) to (%d,%d)\n", startX, startY, endX, endY);
    }
}