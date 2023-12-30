package org.example;

import java.util.List;

/**
 * Класс для определения цвета
 */
public class ColorAnalizer {
    private List<ColorInterface> listColors;

    public ColorAnalizer(List<ColorInterface> listColors) {
        this.listColors = listColors;
    }

    /**
     * Анализирует значение value на соотвествие определенному цвету
     * @param value
     * @return окрашенное в определенный цвет value
     */
    public String analize(int value){

        for (ColorInterface item : listColors) {
            int[] spectrum = item.getSpectrum();
            if(value >= spectrum[0] && value <= spectrum[1])
                return item.getPrintParametr() + value;
        }

        return "Not correct";
    }

}
