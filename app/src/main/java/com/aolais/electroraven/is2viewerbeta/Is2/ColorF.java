package com.aolais.electroraven.is2viewerbeta.Is2;

/**
 * Created by w7 on 07/03/2015.
 */
public class ColorF {

    public static ColorF Red;

    public static ColorF Green;

    public static ColorF Blue;

    public static ColorF White;

    public static ColorF Black;

    public double R;

    public double G;

    public double B;

     ColorF()
    {
        ColorF.Red = new ColorF(1, 0, 0);
        ColorF.Green = new ColorF(0, 1, 0);
        ColorF.Blue = new ColorF(0, 0, 1);
        ColorF.White = new ColorF(1, 1, 1);
        ColorF.Black = new ColorF(0, 0, 0);
    }

    public ColorF(double r, double g, double b)
    {
        this.R = r;
        this.G = g;
        this.B = b;
    }

    public int ToARGB()
    {
        int r = (int)(this.R * 255 + 0.5);
        int g = (int)(this.G * 255 + 0.5);
        int b = (int)(this.B * 255 + 0.5);
        return r << 16 | g << 8 | b | -16777216;
    }


}
