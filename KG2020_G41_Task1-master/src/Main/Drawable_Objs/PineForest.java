package Main.Drawable_Objs;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PineForest implements Drawable{
    int width;
    int height;
    List<Pine> pf = new ArrayList<>();

    private class Pine {
        private int xMp;
        private int yMp;

        public int getxMp() {
            return xMp;
        }

        public int getyMp() {
            return yMp;
        }

        public Pine() {
            Random rnd = new Random();
            this.xMp = rnd.nextInt(100);
            this.yMp = rnd.nextInt(100);
        }
    }

    public PineForest() {
        for (int i = 0; i < 50; i++) {
            pf.add(new Pine());
        }
    }

    public void draw(int width, int height, Graphics2D g) {
        this.height = height;
        this.width = width;
        draw(g);
    }

    @Override
    public void draw(Graphics2D g) {
        Random rand = new Random();

        for (Pine pine : pf) {
            int h = height * pine.yMp / 1500;
            int pos = width * pine.xMp / 100;
            int[] x = {pos - 40, pos, pos + 40};
            int[] y = {height - height / 5 - h, height - height / 5 - h - 120, height - height / 5 - h};
            for (int j = 0; j < 2; j++) {
                g.setColor(new Color(0x09340A));
                g.fillPolygon(x, y ,3);
                g.setColor(Color.black);
                g.drawPolygon(x, y ,3);

                y[0] -= 100;
                y[1] -= 100;
                y[2] -= 100;
            }
            g.setColor(new Color(0x09340A));
            g.fillPolygon(x, y ,3);
            g.setColor(Color.black);
            g.drawPolygon(x, y ,3);
        }
    }
}
