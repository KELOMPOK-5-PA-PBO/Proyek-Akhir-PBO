/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.databaseConnection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class karyawan {
    private final databaseConnection db = new databaseConnection();
    
    public int nip_karyawan;
    public String nama_karyawan;
    public String email_karyawan;
    public String nomor_telpon;
    public String status;
    public int durasi_kerja;
    public double gaji;
    
    
    private final int getId() {
        return this.nip_karyawan;
    }
    
    public final void setStatus(String statuskaryawan) {
        this.status = statuskaryawan;
    }
    
    public final String getStatus() {
        return status;
    }
    
    //mencari NIP untuk pemprosesan delete dan update
     public final boolean find(int nip_karyawan) { 
        boolean isOperationSuccess = false;
        
        try {
            this.db.openConnection();
            
            this.db.preparedStatement = this.db.connection.prepareStatement("SELECT * FROM karyawan WHERE nip_karyawan = ?");
            
            this.db.preparedStatement.setInt(1, nip_karyawan);
            
            this.db.resultSet = this.db.preparedStatement.executeQuery();
            
            if (this.db.resultSet.next()) {
                this.nip_karyawan = nip_karyawan;
                this.nama_karyawan = this.db.resultSet.getString("nama_karyawan");
                this.email_karyawan = this.db.resultSet.getString("email_karyawan");
                this.nomor_telpon = this.db.resultSet.getString("nomor_telpon");
                this.status = this.db.resultSet.getString("status");
                isOperationSuccess = true;
            }
        } catch (SQLException ex) {
            this.db.displayErrors(ex);
        } finally {
            this.db.closeConnection();
        }
        
        return isOperationSuccess;
    }
     
    
    // method tambah data
    public final boolean create() { 
    boolean isOperationSuccess = false;
    
    try {
        this.db.openConnection();
        
        if (isDataValid() && !isIdExists(this.nip_karyawan)) {
            String sql = "INSERT INTO karyawan VALUES (?, ?, ?, ?, ?, ?, ?,null,null,null)";
            this.db.preparedStatement = this.db.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            this.db.preparedStatement.setInt(1, this.nip_karyawan);
            this.db.preparedStatement.setString(2, this.nama_karyawan);
            this.db.preparedStatement.setString(3, this.email_karyawan);
            this.db.preparedStatement.setString(4, this.nomor_telpon);
            this.db.preparedStatement.setDouble(5, this.gaji);
            this.db.preparedStatement.setInt(6, this.durasi_kerja);
            this.db.preparedStatement.setString(7, this.status);
            
            int result = this.db.preparedStatement.executeUpdate();
            
            if (result > 0) {
                this.nip_karyawan = this.db.generateLastId();
                isOperationSuccess = true;
            }
        }
    } catch (SQLException ex) {
        this.db.displayErrors(ex);
    } finally {
        this.db.closeConnection();
    }
    
    return isOperationSuccess;
}

    // method update data
     public final boolean update() { 
        boolean isOperationSuccess = false;

        try {
            this.db.openConnection();

            if (isDataValid()) { // Memeriksa apakah data yang akan diupdate adalah valid
            String sql = "UPDATE karyawan "
                        + "SET nama_karyawan = ?, "
                        + "email_karyawan = ?, "
                        + "nomor_telpon = ?, " 
                        + "gaji = ?, "
                        + "durasi_kerja = ? "
                        + "WHERE nip_karyawan = ?";


                this.db.preparedStatement = this.db.connection.prepareStatement(sql);

                this.db.preparedStatement.setString(1, this.nama_karyawan);
                this.db.preparedStatement.setString(2, this.email_karyawan);
                this.db.preparedStatement.setString(3, this.nomor_telpon);
                this.db.preparedStatement.setDouble(4, this.gaji);
                this.db.preparedStatement.setInt(5, this.durasi_kerja);
                this.db.preparedStatement.setInt(6, this.nip_karyawan);
                int result = this.db.preparedStatement.executeUpdate();

                isOperationSuccess = result > 0;
            }
         } catch (SQLException ex) {
            this.db.displayErrors(ex);
         } finally {
            this.db.closeConnection();
         }

         return isOperationSuccess;
     }
       
     
    // method hapus data
     public final boolean delete() { 
        boolean isOperationSuccess = false;
        
        try {
            this.db.openConnection();
            
            String sql = "DELETE FROM karyawan WHERE nip_karyawan = ?";
            this.db.preparedStatement = this.db.connection.prepareStatement(sql);
            
            this.db.preparedStatement.setInt(1, this.nip_karyawan);
            
            int result = this.db.preparedStatement.executeUpdate();
            
            isOperationSuccess = result > 0;
        } catch (SQLException ex) {
            this.db.displayErrors(ex);
        } finally {
            this.db.closeConnection();
        } 
        return isOperationSuccess;
    }
     
    
    // method memeriksa apakah NIP yang ditambah telah ada
    private final boolean isIdExists(int nip) { 
        try {
            String checkSql = "SELECT COUNT(*) FROM karyawan WHERE nip_karyawan = ?";
            this.db.preparedStatement = this.db.connection.prepareStatement(checkSql);
            this.db.preparedStatement.setInt(1, nip);
            ResultSet resultSet = this.db.preparedStatement.executeQuery();

            if (resultSet.next() && resultSet.getInt(1) > 0) {
                return true; 
            }
        } catch (SQLException ex) {
            this.db.displayErrors(ex);
        }

        return false; 
    } 
    
    
    // method memeriksa apakah data yang diisi tidak ada yang empty
    private final boolean isDataValid() { 
        return !nama_karyawan.isEmpty() && !email_karyawan.isEmpty() && !nomor_telpon.isEmpty() && !status.isEmpty();
    }
    
    
    // method hitung jumlah karyawan untuk imlementasi static
    public final static int hitungKaryawan() { 
    int jumlahData = 0;
    
    try {
        databaseConnection db = new databaseConnection();
        db.openConnection();
        db.preparedStatement = db.connection.prepareStatement("SELECT COUNT(*) FROM karyawan");
        db.resultSet = db.preparedStatement.executeQuery();
        
        if (db.resultSet.next()) {
            jumlahData = db.resultSet.getInt(1);
        }
        db.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jumlahData;
    }
    
    
    // method hitung gaji untuk implementasi override
    public double hitungGaji() { 
        return 0.0;
    }
    
    
    // Overloading untuk manager
    public void setjamKerja(int durasi_kerja, boolean isManager) {
        if (isManager) {
            this.durasi_kerja = durasi_kerja + 2;
        } else {
            this.durasi_kerja = durasi_kerja;
        }
    }
    
    // Overloading untuk staff
    public void setjamKerja(int durasi_kerja) {
        this.durasi_kerja= durasi_kerja;
    }
    
    
    // Overloading untuk staff magang
    public void setjamKerja(int durasi_kerja, boolean isMagang, int jamLembur) {
        if (isMagang) {
            this.durasi_kerja = durasi_kerja + jamLembur;
        } else {
            this.durasi_kerja = durasi_kerja;
        }
    }

}
