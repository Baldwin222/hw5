package homework.square;

import homework.figures.Rectangle;

public final class Square extends Rectangle {
    int side;
    @Override
    public int getArea(){
        return super.getArea(side,side);
    }
    @Override
    public int getPerimeter(){
        return super.getPerimeter(side,side);
    }

    public Square(int side) {
        this.side = side;

    }


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
