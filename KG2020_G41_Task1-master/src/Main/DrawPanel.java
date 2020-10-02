package Main;

import Main.Drawable_Objs.*;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private int width = 1000, height = 1000;
    private PineForest pf = new PineForest();
    private Sun sun;
    private House house;
    private Background bg;
    private TopolM topol;
    private Sky sky;
    private Table table;

    private void remakeAll() {
        width = getWidth();
        height = getHeight();
        sun = new Sun(width * 7 /10, height / 10, height / 20, height * 2 / 10, 30, Color.orange);
        house = new House(height * 4 / 10, width * 4 / 10, new Color(101, 67, 33), Color.white, 0, height * 6 /10);
        topol = new TopolM(width, height);
        bg = new Background(width, height, width, height);
        sky = new Sky(width, height);
        table = new Table(height * 4 / 10, width * 4 / 10 + 400);
    }

    private void redrawAll(Graphics g) {
        sky.draw((Graphics2D)g);
        sun.draw((Graphics2D)g);
        pf.draw(width, height, (Graphics2D)g);
        bg.draw((Graphics2D)g);
        house.draw((Graphics2D)g);
        topol.draw((Graphics2D)g);
        table.draw((Graphics2D)g);
    }

    @Override
    public void paint(Graphics g) {
        remakeAll();
        super.paint(g);
        redrawAll(g);
    }
}