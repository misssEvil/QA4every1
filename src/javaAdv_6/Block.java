package javaAdv_6;

public class Block {

    private int width;
    private int height;
    private int length;
    private int volume;
    private int surfaceArea;

    int [] dim;

    Block(int [] dim){
        width = dim[0];
        length = dim[1];
        height = dim[2];

    }

    Block(int width, int length, int height){
        this.width = width;
        this.length = length;
        this.height = height;
    }

    int getWidth(){
        return this.width;
    }

    int getLength(){
        return this.length;
    }

    int getVolume(){
        return width * length * height;
    }

    int getSurfaceArea(){
        return 2 * (width * length + width * height + length * height);
}




}



