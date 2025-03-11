/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

/**
 *
 * @author icesp
 */
public class Reproductor {

    /**
     * @return the carPlay
     */
    public Boolean getHasCarPlay() {
        return hasCarPlay;
    }

    /**
     * @param carPlay the carPlay to set
     */
    public void setHasCarPlay(Boolean carPlay) {
        this.hasCarPlay = carPlay;
    }

    /**
     * @return the bluetooth
     */
    public Boolean getHasBluetooth() {
        return hasBluetooth;
    }

    /**
     * @param bluetooth the bluetooth to set
     */
    public void setHasBluetooth(Boolean bluetooth) {
        this.hasBluetooth = bluetooth;
    }

    /**
     * @return the radio
     */
    public String getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(String radio) {
        this.radio = radio;
    }

    /**
     * @return the usb
     */
    public String getUsb() {
        return usb;
    }

    /**
     * @param usb the usb to set
     */
    public void setUsb(String usb) {
        this.usb = usb;
    }

    
    private String radio;
    private String usb;
    private Boolean hasCarPlay;
    private Boolean hasBluetooth;
}
