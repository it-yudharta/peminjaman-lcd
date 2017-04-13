package it.yudharta.peminjamanlcd.service;

import it.yudharta.peminjamanlcd.entity.Barang;
import it.yudharta.peminjamanlcd.repository.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BarangService {
    @Autowired
    BarangRepository barangRepository;
    
    public Iterable<Barang> findAll() {
        return barangRepository.findAll();
    }
    
}
