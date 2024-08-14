/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import Model.ClownStick;
import Model.ImageObject;
import Model.Rectangle;
import Model.Shapes;
import eg.edu.alexu.csd.oop.game.GameObject;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author youssef
 */
@SuppressWarnings("unused")
public class Clown {

    private static Clown instance = null;

    private Clown() {

    }

    public static Clown getInstance() {

        if (instance == null) {
            instance = new Clown();
        }
        return instance;
    }

    public Shapes createClown() {
        return new ImageObject(300, 410, true, "/clownn.png");
    }

}
