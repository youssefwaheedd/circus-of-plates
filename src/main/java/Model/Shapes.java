/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

import java.awt.Color;
import java.util.List;

/**
 *
 * @author youssef
 */
@SuppressWarnings("unused")
public interface Shapes {
    public Color getColor();

    public boolean isCaughtByLeft();

    public void setcaughtByLeft(boolean x);

    public boolean isCaughtByRight();

    public void setcaughtByRight(boolean x);

    public void setVisible(boolean x);

}
