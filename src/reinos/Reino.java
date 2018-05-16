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
public interface Reino {
    Elfos getElfos(String tipo);
    Orcos getOrcos(String tipo);
}
