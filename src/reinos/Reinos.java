/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos;

import reinos.elfos.Elfos;
import reinos.orcos.Orcos;

/**
 *
 * @author Karina Mina
 */
public class Reinos {

    public static void main(String[] args) {
        Reino reinos;

        reinos = FactoryProducer.getFactory("elfos");
        Elfos elfo = reinos.getElfos("mago");
        elfo.atacar();

        reinos = FactoryProducer.getFactory("orcos");
        Orcos orcos = reinos.getOrcos("hechicero");
        orcos.contraAtacar();
    }
}