package com.aolais.electroraven.is2viewerbeta.Is2;

/**
 * Created by w7 on 07/03/2015.
 */
public class TablePalette {

    public ColorF GetTableColor(ColorF[] table,double intensity){
        if(true){
            intensity=1-intensity;
        }
        double num = intensity * ((double)((int)table.length) - 1);
        int length = (int)num;
        int length1 = length + 1;
        if (length < 0)
        {
            length = 0;
        }
        if ((double)length > (double)((int)table.length) - 1)
        {
            length = (int)table.length - 1;
        }
        if (length1 < 0)
        {
            length1 = 0;
        }
        if ((double)length1 > (double)((int)table.length) - 1)
        {
            length1 = (int)table.length - 1;
        }
        double r = table[length].R;
        double g = table[length].G;
        double b = table[length].B;
        if (length != length1)
        {
            double r1 = table[length1].R - r;
            double g1 = table[length1].G - g;
            double b1 = table[length1].B - b;
            double num1 = num - (double)length;
            r = r + r1 * num1;
            g = g + g1 * num1;
            b = b + b1 * num1;
        }
        return new ColorF(r, g, b);

    }
}
