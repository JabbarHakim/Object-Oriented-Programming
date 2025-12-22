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
import java.util.ArrayList;
import java.util.List;

public class Peminjaman implements IPeminjaman, Serializable {
    private Anggota anggota;
    private List<Buku> daftarBuku = new ArrayList<>();

    public Peminjaman(Anggota anggota) {
        this.anggota = anggota;
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    @Override
    public void pinjam() {
        System.out.println("Peminjaman oleh: " + anggota.getNama());
        for (Buku b : daftarBuku) {
            b.tampilInfo();
        }
    }

    @Override
    public void kembalikan() {
        System.out.println("Buku dikembalikan oleh: " + anggota.getNama());
        daftarBuku.clear();
    }
}

