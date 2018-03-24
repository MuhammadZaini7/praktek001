/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek001;

/**
 *
 * @author proWindows7
 */
public class Mie_instanAksi {
     public static void main(String[] args) {
        mie_instan mie_goreng = new mie_instan();
        mie_instan mie_kering = new mie_instan();
        mie_instan mie_kuah = new mie_instan();
        
        mie_goreng.bumbu="Bawang Merah, Bawang Putih ";
        mie_goreng.kecap="Kedelai Hitam";
        mie_goreng.kemasan="Putih";
        mie_goreng.minyak="Minyak Goreng";
        mie_goreng.harga=5000;
        
        mie_kering.bumbu="Bawang, Tomat ";
        mie_kering.kecap="Kecap Sedap";
        mie_kering.kemasan="Merah";
        mie_kering.minyak="Minyak Lemak";
        mie_kering.harga=3000;
        
        mie_kuah.bumbu="Sayur, Tomat ";
        mie_kuah.kecap="Kecap Bango";
        mie_kuah.kemasan="Biru";
        mie_kuah.minyak="Minyak Lemak";
        mie_kuah.harga=7000;
        
        
        mie_goreng.cara_masak();
        mie_kering.cara_masak();
        mie_kuah.cara_masak();
    }
}
