/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author Shaco JX
 */
public class area implements IEntity{
    
    int id_area;
    String area;
    ArrayList<mem> listmem;

    public area() {
        listmem = new ArrayList<>();
    }

    public area(int id_area, String area) {
        this.id_area = id_area;
        this.area = area;
    }
    
    

    public area(int id_area, String area, ArrayList<mem> listmem) {
        this.id_area = id_area;
        this.area = area;
        this.listmem = listmem;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public ArrayList<mem> getListmem() {
        return listmem;
    }

    public void setListmem(ArrayList<mem> listmem) {
        this.listmem = listmem;
    }

    @Override
    public String toString() {
        return "area{" + "id_area=" + id_area + ", area=" + area + ", listmem=" + listmem + '}';
    }
    
}
