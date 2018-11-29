/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorium4;

import java.awt.Point;

/**
 *
 * @author m_wojdyna
 */
public class Plane
{
    //int idPlane ;
    int fuel;
    int status;
    Point coordinates;
    Airport arrive;
    Airport leave; 

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public Airport getArrive() {
        return arrive;
    }

    public void setArrive(Airport arrive) {
        this.arrive = arrive;
    }
   
}
