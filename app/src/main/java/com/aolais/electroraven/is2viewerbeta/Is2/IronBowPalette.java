package com.aolais.electroraven.is2viewerbeta.Is2;

/**
 * Created by w7 on 07/03/2015.
 */
public class IronBowPalette {
    private static ColorF[] ironBowTable;

    private static ColorF satLowColor;

    private static ColorF satHighColor;

    IronBowPalette()
    {
        ColorF[] colorF = new ColorF[] { new ColorF(1, 1, 1), new ColorF(1, 0.980392, 0.705882), new ColorF(1, 0.921569, 0.313725), new ColorF(0.996078, 0.823529, 0.039216), new ColorF(0.992157, 0.705882, 0), new ColorF(0.976471, 0.568627, 0), new ColorF(0.952941, 0.45098, 0), new ColorF(0.92549, 0.337255, 0.039216), new ColorF(0.87451, 0.215686, 0.227451), new ColorF(0.803922, 0.090196, 0.486275), new ColorF(0.721569, 0.015686, 0.584314), new ColorF(0.576471, 0, 0.611765), new ColorF(0.380392, 0, 0.603922), new ColorF(0.168627, 0, 0.537255), new ColorF(0.031373, 0, 0.333333), new ColorF(0, 0, 0) };
        IronBowPalette.ironBowTable = colorF;
        IronBowPalette.satLowColor = new ColorF(0.7, 0.6, 0.3);
        IronBowPalette.satHighColor = new ColorF(0, 0.5, 0);
    }

    public  ColorF GetColor(double intensity)
    {
        TablePalette tablePalette=new TablePalette();
        return tablePalette.GetTableColor(IronBowPalette.ironBowTable, intensity);
    }

}
