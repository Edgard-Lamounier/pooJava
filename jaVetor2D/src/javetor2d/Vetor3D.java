/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javetor2d;

/**
 *
 * @author EDGARD
 */
public class Vetor3D extends Vetor2D {
    private double z;

    public Vetor3D() {
        this.x = 0.0;
        this.y = 0.0;
        z = 0.0;
    }
    
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
}
