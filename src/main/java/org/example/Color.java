package org.example;

/**
 * Класс описывающий цвет
 */
public class Color implements ColorInterface{
    private int[] spectrum;
    private String printParametr;

    public Color(String type, int downValue , int topValue, String printParametr) {
        spectrum = new int[2];
        spectrum[0] = downValue;
        spectrum[1] = topValue;
        this.printParametr = printParametr;
    }

    @Override
    public String getPrintParametr() { return printParametr; }

    @Override
    public int[] getSpectrum() { return spectrum; }
}
