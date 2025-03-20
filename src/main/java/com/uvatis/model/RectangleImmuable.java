package com.uvatis.model;

public class RectangleImmuable {
    protected double longueur;
    protected double largeur;

    public RectangleImmuable(double longueur, double largeur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getArea() {
        return (this.longueur + this.largeur) * 1;
    }

    @Override
    public String toString() {
        return "RectangleImmuable{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", aire=" + getArea() +
                '}';
    }
}
