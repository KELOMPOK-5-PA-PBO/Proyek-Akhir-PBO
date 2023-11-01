/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author HP
 */
public class staff_magang extends karyawan {
    private final int shift;
    
    public staff_magang(int nip, String nama, String email, String nomor_telpon, int shift, double gaji, String status) {
        this.nip_karyawan = nip;
        this.nama_karyawan = nama;
        this.email_karyawan = email;
        this.nomor_telpon = nomor_telpon;
        this.shift = shift;
        this.gaji = gaji;
        this.status = status;
    }
    
    @Override
    public double hitungGaji() {
        return gaji / shift;
    }
    
    public final int getjamKerja() {
        return durasi_kerja;
    }
    
}
