package com.uvatis;
import com.uvatis.model.RectangleImmuable;
import com.uvatis.model.RectangleMutable;

public class Main {
    public static void main(String[] args) {

        RectangleMutable rect1 = new RectangleMutable();
        rect1.setLargeur(5);
        rect1.setLongueur(10);
        System.out.println(rect1);

        RectangleImmuable rect2 = new RectangleImmuable(30, 25);
        System.out.println(rect2);
    }



}