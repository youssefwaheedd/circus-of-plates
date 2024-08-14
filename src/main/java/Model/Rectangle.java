/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import eg.edu.alexu.csd.oop.game.GameObject;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author youssef
 */
@SuppressWarnings("unused")
public class Rectangle implements GameObject, Shapes {

    public static final int SPRITE_HEIGHT = 5;
    private static final int MAX_MSTATE = 1;
    // an array of sprite images that are drawn sequentially
    private BufferedImage[] spriteImages = new BufferedImage[MAX_MSTATE];
    private int x;
    private int y;
    private int width;
    private int height;
    private boolean visible;
    private Color color;
    private boolean horizontalOnly;
    private boolean caughtByRight;
    private boolean caughtByLeft;

    public Rectangle(int posX, int posY, int width, int height, boolean horizontalOnly, Color color) {
        this.x = posX;
        this.y = posY;
        this.width = width;
        this.height = height;
        this.visible = true;
        this.color = color;
        this.horizontalOnly = horizontalOnly;
        // create a bunch of buffered images and place into an array, to be displayed
        // sequentially
        spriteImages[0] = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g2 = spriteImages[0].createGraphics();
        g2.setColor(color);
        g2.setBackground(color);
        g2.fillRect(0, 0, width, height);
        g2.dispose();

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int mX) {
        this.x = mX;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int mY) {
        if (horizontalOnly) {
            return;
        }
        this.y = mY;
    }

    @Override
    public BufferedImage[] getSpriteImages() {
        return spriteImages;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public boolean isCaughtByRight() {
        return caughtByRight;
    }

    public void setcaughtByRight(boolean caughtByRight) {
        this.caughtByRight = caughtByRight;
    }

    public boolean isCaughtByLeft() {
        return caughtByLeft;
    }

    public void setcaughtByLeft(boolean caughtByLeft) {
        this.caughtByLeft = caughtByLeft;
    }

}
