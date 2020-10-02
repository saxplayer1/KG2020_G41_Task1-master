package Main.Drawable_Objs;

import java.awt.*;

public class House implements Drawable {
    int height;
    int width;
    Color roofColor;
    Color wallsColor;
    int x0;
    int y0;

    public House(int height, int width, Color roofColor, Color wallsColor, int x0, int y0) {
        this.height = height;
        this.width = width;
        this.roofColor = roofColor;
        this.wallsColor = wallsColor;
        this.x0 = x0;
        this.y0 = y0;
    }

    @Override
    public void draw(Graphics2D g) {

        g.setColor(Color.BLACK);
        g.drawRect(x0, y0, width, height / 2);
        g.setColor(wallsColor);
        g.fillRect(x0, y0, width, height / 2);
        g.setColor(new Color(255 - wallsColor.getRed(), 255 - wallsColor.getGreen(), 255 - wallsColor.getBlue()));
        g.fillRect(x0 + width / 6, y0 + height / 6, width / 6, height / 3);

        int[] xPol = {x0 - width / 4, x0 + width / 2, x0 + width * 5 / 4};
        int[] yPol = {y0, y0 - height / 2, y0};
        g.setColor(Color.BLACK);
        g.drawPolygon(xPol, yPol, 3);
        g.setColor(roofColor);
        g.fillPolygon(xPol, yPol, 3);

        g.setColor(Color.blue);
        g.fillRect(x0 + width / 2, y0 + height / 8, width * 2 / 5, height / 6);

        g.setColor(Color.black);
        g.setStroke(new BasicStroke(5));
        g.drawRect(x0 + width / 2, y0 + height / 8, width * 2 / 5, height / 6);
        for (int i = 0; i <= 3; i++) {
            g.drawLine(x0 + width / 2 + width * 2 * i / 20, y0 + height / 8 , x0 + width / 2 + width * 2 * i / 20, y0 + height * 7 / 24);
        }
        g.drawLine(x0 + width / 2, y0 + height * 5 / 24, x0 + width * 9 / 10, y0 + height * 5 / 24);
    }
}
