/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuas;

/**
 *
 * @author ER-HA
 */
import java.io.Serializable;

public abstract class KoleksiPerpustakaan implements Serializable {
    protected String id;
    protected String judul;

    public KoleksiPerpustakaan(String id, String judul) {
        this.id = id;
        this.judul = judul;
    }

    public abstract void tampilInfo();

    public String getId() {
        return id;
    }
}




