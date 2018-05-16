/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos.elfos;

import reinos.Reino;
import reinos.orcos.Orcos;

/**
 *
 * @author Karina Mina
 */
public class ReinoElfo implements Reino {

    @Override
    public Elfos getElfos(String tipo) {
        switch (tipo) {
            case "arquero":
                return new Arquero();
            case "mago":
                return new Mago();
            case "reyElfo":
                return new ReyElfo();
        }
        return null;
    }
    
    @Override
    public Orcos getOrcos(String tipo) {
        return null;
    }
}
