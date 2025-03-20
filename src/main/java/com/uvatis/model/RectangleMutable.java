package com.uvatis.model;

public class RectangleMutable
{
    protected double longueur;
    protected double largeur;


    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getArea() {
        return (this.largeur + this.longueur) * 2;
    }

    @Override
    public String toString() {
        return "RectangleMutable{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", aire=" + getArea() +
                '}';
    }
}
