package homework.figures;

public class Rectangle extends Figure{
    private int width;
    private int height;

    @Override
    protected int getPerimeter(){
        return 2*(width+height);
    }

    @Override
    protected int getArea(){
        return width*height;
    }

    protected int getArea(int width,int height){
        return width*height;
    }

    protected int getPerimeter(int width, int height){
        return 2*(width+height);
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
    public Rectangle(int width, int height){
        setWidth(width);
        setHeight(height);
    }
    public Rectangle(){
        setWidth(3);
        setHeight(4);
    }
}
