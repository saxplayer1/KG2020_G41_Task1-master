package Main.Drawable_Objs;

import java.awt.*;

public class Sun implements Drawable {
    private int x0, y0, r, R, n;
    private Color c;

    public Sun(int x0, int y0, int r, int r1, int n, Color c) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
        R = r1;
        this.n = n;
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(c);
        g.fillOval(x0 - r, y0 - r, 2 * r, 2 * r);
        g.setStroke(new BasicStroke(5));
        double dA = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            g.drawLine((int)(x0 - r * Math.cos(dA * i)), (int)(y0 - r * Math.sin(dA * i)),
                    (int)(x0 - R * Math.cos(dA * i)), (int)(y0 - R * Math.sin(dA * i)));
        }
    }
}
