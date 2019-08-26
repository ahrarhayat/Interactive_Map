package module6;

import processing.core.PApplet;

/**
 * Created by ahr_a on 8/26/2019.
 */
public class SecondApplet extends PApplet
{
    private int nearby;
    public SecondApplet(int EartquakesNearby)
    {
       this.nearby=EartquakesNearby;
    }

    public void settings() {
        size(400, 400);

    }
    public void draw() {

        background(255);
        fill(50);
        text("Earthquake(s) affecting the city: "+nearby,10,10,70,80);
    }
}
