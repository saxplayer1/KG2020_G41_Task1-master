package Main.Drawable_Objs;

import java.awt.*;

public class TopolM implements Drawable{
    int width;
    int height;

    public TopolM(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D g) {

        double c = Math.sqrt(width * width + height * height);
        double sin = height / c;
        double cos = width / c;

        int[] yPoints = {height * 6 / 10, height * 6 / 10, height * 7 / 10, height * 7 / 10, height * 65 / 100};

        int[] xPoints = {(int) (width * 6 / 10 ),(int) ((width * 6 / 10 + width / 2)), width * 6 / 10 + width / 2, (int) (width * 6 / 10 ), (int) (((width * 6 / 10) - width / 10))};

        g.setColor(new Color(0x1C6A02));
        g.fillPolygon(xPoints, yPoints, 5);

        g.setColor(Color.black);
        g.drawPolygon(xPoints, yPoints, 5);
        g.setStroke(new BasicStroke(5));

        g.setColor(new Color(0x033B05));
        g.fillRect(width * 6 / 10, height * 7 / 10, width / 2,width / 10);

        g.setColor(new Color(0x033B05));
        g.fillRect(width * 6 / 10, height * 65 / 100, width / 7, width / 15);

        g.setColor(new Color(0x9500FFD7, true));
        g.fillRect(width * 6 / 10 + width / 60, height * 67 / 100 , width * 8 / 70, width / 33);


        g.setStroke(new BasicStroke(6));
        for (int i = 1; i <= 6; i++) {
            g.setColor(new Color(0x033B05));
            g.fillOval(width * 6 / 10 + width * 6 * i / 100, height * 77 / 100, width / 18, width / 18);
            g.setColor(Color.black);
            g.drawOval(width * 6 / 10 + width * 6 * i / 100, height * 77 / 100, width / 18, width / 18);

        }
    }
}
