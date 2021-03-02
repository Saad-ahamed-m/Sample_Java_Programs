public class Box {
    int width;
    int length;
    int height;
    public int volume()
    {
        return length*width*height;
    }
    public int surfacearea()
    {
        return (2*(length*height)+(length*width)+(width*height));
    }
}