/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author HP
 */
public class manager extends karyawan {
    private final double bonus;
    private final int kelipatan;
    
    public manager (int nip, String nama, String email, String nomor_telpon, int kelipatan, double bonus, double gaji, String status) {
        this.nip_karyawan = nip;
        this.nama_karyawan = nama;
        this.email_karyawan = email;
        this.nomor_telpon = nomor_telpon;
        this.bonus = bonus;
        this.kelipatan = kelipatan;
        this.gaji = gaji;
        this.status = status;
    }
    
    @Override
    public double hitungGaji() {
        return gaji * kelipatan + bonus ;
    }
    
    public final int getjamKerja() {
        return durasi_kerja;
    }
    
}
