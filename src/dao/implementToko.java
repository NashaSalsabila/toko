/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import model.model_toko;


/**
 *
 * @author Ashbld
 */
public interface implementToko {
    
     public void TampilData(model_toko a);
    public void UbahData(model_toko a);
    public void SimpanData(model_toko a);
    public void HapusData(String kode);
    public List<model_toko> getCariKategori(String kategori);
    public List<model_toko> getAll();
    }

    
    
