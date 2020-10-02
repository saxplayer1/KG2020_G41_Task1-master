package Main.Drawable_Objs;

import java.awt.*;

public class Sky implements Drawable{
    int width;
    int height;

    public Sky(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(173, 216, 230));
        g.fillRect(0, 0, width, height);
    }
}
