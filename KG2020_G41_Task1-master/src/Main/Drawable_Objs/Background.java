package Main.Drawable_Objs;

import java.awt.*;

public class Background implements Drawable{
    int x0;
    int y0;
    int width;
    int height;

    public Background(int x0, int y0, int width, int height) {
        this.x0 = x0;
        this.y0 = y0;
        this.width = width;
        this.height = height;
    }



    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.green);
        g.fillOval(x0 - width * 3 / 2, y0 - height / 4, width * 2, height / 2);
    }
}
