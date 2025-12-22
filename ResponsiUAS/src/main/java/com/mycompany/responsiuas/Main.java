/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuas;

/**
 *
 * @author ER-HA
 */
public class Main {
    public static void main(String[] args) {

        // Agregasi
        Perpustakaan perpustakaan = new Perpustakaan();
        Anggota a1 = new Anggota("A01", "Budi");
        perpustakaan.tambahAnggota(a1);

        // Buku
        Buku b1 = new Buku("B01", "Pemrograman Java", "Satrio");
        Buku b2 = new Buku("B02", "OOP Lanjut", "Dante");

        // Komposisi
        Peminjaman p = new Peminjaman(a1);
        p.tambahBuku(b1);
        p.tambahBuku(b2);

        // Interface
        p.pinjam();
        p.kembalikan();

        // File I/O
        perpustakaan.simpanData("anggota.dat");
        perpustakaan.bacaData("anggota.dat");
    }
}


