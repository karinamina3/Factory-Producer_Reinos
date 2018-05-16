/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos.orcos;

import reinos.Reino;
import reinos.elfos.Elfos;

/**
 *
 * @author Karina Mina
 */
public class ReinoOrco implements Reino {

    @Override
    public Elfos getElfos(String tipo) {
        return null;
    }
    
    @Override
    public Orcos getOrcos(String tipo) {
        switch (tipo) {
            case "lanzador":
                return new Lanzador();
            case "hechicero":
                return new Hechicero();
            case "bestiaMayor":
                return new BestiaMayor();
        }
        return null;
    }
}
