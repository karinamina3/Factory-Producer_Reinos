/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos;

import reinos.elfos.ReinoElfo;
import reinos.orcos.ReinoOrco;

/**
 *
 * @author Mena
 */
public class FactoryProducer {
    public static Reino getFactory(String type){
        switch (type){
            case "elfos":
                return  new ReinoElfo();
            case "orcos":
                return new ReinoOrco();
        }
        return null;
    }
}
