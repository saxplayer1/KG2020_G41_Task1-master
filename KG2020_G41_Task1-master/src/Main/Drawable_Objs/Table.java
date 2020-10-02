package Main.Drawable_Objs;

import java.awt.*;

public class Table implements Drawable{
    int x0, y0;

    public Table(int x0, int y0) {
        this.x0 = x0;
        this.y0 = y0;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setStroke(new BasicStroke(10));
        g.setColor(new Color(0x523C00));
        g.drawLine(x0 + 75, y0 + 50, x0 + 75, y0 - 50);
        g.setColor(Color.white);
        g.fillRect(x0, y0 - 50,  150,  60);
        g.setColor(new Color(0x523C00));
        g.drawRect(x0, y0 - 50,  150,  60);
        g.drawString("Дом у тополя" ,x0 + 18, y0 - 23);
        g.drawString("(тополь макет)" ,x0 + 18, y0 - 9);
    }
}
