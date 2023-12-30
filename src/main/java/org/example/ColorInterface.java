package org.example;

/**
 * Интерфейс базовых методов для описания цвета
 */
public interface ColorInterface {

    /**
     * Возврашает парамерт для печати цвета
     * @return printParametr
     */
    String getPrintParametr();

    /**
     * Возвращает диапазон спектра цвета
     * @return spectrum
     */
    int[] getSpectrum();
}
