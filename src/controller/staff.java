/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author HP
 */
public class staff extends karyawan {
    
    public staff(int nip, String nama, String email, String nomor_telpon, double gaji, String status) {
        this.nip_karyawan = nip;
        this.nama_karyawan = nama;
        this.email_karyawan = email;
        this.nomor_telpon = nomor_telpon;
        this.gaji = gaji;
        this.status = status;
    }
    
    @Override
    public double hitungGaji() {
        return gaji;
    }
    
    public final int getjamKerja() {
        return durasi_kerja;
    }
}
