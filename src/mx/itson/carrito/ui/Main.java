/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;
import mx.itson.carrito.entidades.Propietario;
import mx.itson.carrito.entidades.Reproductor;
import mx.itson.carrito.enums.TipoMotor;
import mx.itson.carrito.enums.TipoTransmision;

/**
 *
 * @author icesp
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    System.out.println("Ingresa la distancia recorrida: ");
    double distancia = sc.nextDouble();
    
    System.out.println("Ingresa la velocidad recorrida: ");
    double velocidad = sc.nextDouble();
    
    //Generamos una instancia en la clase carro
    Carro bmw = new Carro();
    bmw.setMarca("BMW");
    bmw.setColor("Negro");
    bmw.setAnio(2021);
    bmw.setKilometraje(10000);
    bmw.setTipoMotor(TipoMotor.HÍBRIDO);
    bmw.setTipoTransmision(TipoTransmision.ESTANDAR);
    
    //datos del propietario
    Propietario prop = new Propietario();
    prop.setNombre("Patricio Kelvin");
    prop.setDomicilio("Calle 23 colonia congo");
    prop.setTelefono("6221734422");
    prop.setEmail("patrikel@gmail.com");
    
    bmw.setPropietario(prop);
    
    //datos de la musica del carro
    Reproductor audio = new Reproductor();
    audio.setRadio("Pop");
    audio.setUsb("Rock");
    audio.setHasBluetooth(Boolean.TRUE);
    audio.setHasCarPlay(Boolean.FALSE);
    
    bmw.setReproductor(audio);
    
    //invocamos al metodo contenido en la clase carro
    double tiempo = bmw.calcularTiempo(distancia, velocidad);
    
    System.out.println("El tiempo que le tomara al carro " + bmw.getMarca() 
            + " de color " + bmw.getColor() + " del año " + bmw.getAnio() + " es de: " + tiempo
    + " y ahora, su kilometraje es de " + bmw.getKilometraje() + " . El propietario de este carro es: "
    + bmw.getPropietario().getNombre() + " y esta escuchando: " + bmw.getReproductor().getUsb());
    }
}
