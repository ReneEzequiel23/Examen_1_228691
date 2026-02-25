/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrarcitamedica_228691;

import control.ControlCitas;
import modelo.Modelo;
import vista.PantallaCitas;
import vista.PantallaIngreso;

/**
 *
 * @author renee
 */
public class RegistrarCitaMedica_228691 {

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        
        ControlCitas control = new ControlCitas(modelo);
        
        PantallaIngreso ingreso = new PantallaIngreso(control);
        PantallaCitas citas = new PantallaCitas(control);
        ingreso.show();
    }
}
