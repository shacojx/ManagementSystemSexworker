/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Shaco JX
 */
public class mem implements IEntity{
    
    int id;
    String name;
    int year;
    String phone;
    int price;
    int id_area;
    String height;
    int vong1;
    int vong2;
    int vong3;
    String service;

    public mem() {
    }

    public mem(int id, String name, int year, String phone, int price, int id_area, String height, int vong1, int vong2, int vong3, String service) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.phone = phone;
        this.price = price;
        this.id_area = id_area;
        this.height = height;
        this.vong1 = vong1;
        this.vong2 = vong2;
        this.vong3 = vong3;
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getVong1() {
        return vong1;
    }

    public void setVong1(int vong1) {
        this.vong1 = vong1;
    }

    public int getVong2() {
        return vong2;
    }

    public void setVong2(int vong2) {
        this.vong2 = vong2;
    }

    public int getVong3() {
        return vong3;
    }

    public void setVong3(int vong3) {
        this.vong3 = vong3;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "mem{" + "id=" + id + ", name=" + name + ", year=" + year + ", phone=" + phone + ", price=" + price + ", id_area=" + id_area + ", height=" + height + ", vong1=" + vong1 + ", vong2=" + vong2 + ", vong3=" + vong3 + ", service=" + service + '}';
    }
    
    
}
