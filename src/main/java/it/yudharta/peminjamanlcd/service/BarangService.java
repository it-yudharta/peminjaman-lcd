package it.yudharta.peminjamanlcd.service;

import it.yudharta.peminjamanlcd.entity.Barang;
import it.yudharta.peminjamanlcd.repository.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BarangService {

    @Autowired
    BarangRepository barangRepository;

    public Iterable<Barang> findAll() {
        return barangRepository.findAll();
    }

    public Page<Barang> findAll(Pageable pageable) {
        return barangRepository.findAll(pageable);
    }
    
    public Barang findOne(Integer id) {
        return barangRepository.findOne(id);
    }

    public void save(Barang barang) {
        barangRepository.save(barang);
    }

    public void delete(Integer id) {
        barangRepository.delete(id);
    }

}
