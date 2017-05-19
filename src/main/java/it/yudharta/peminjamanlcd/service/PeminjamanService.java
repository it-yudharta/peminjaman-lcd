package it.yudharta.peminjamanlcd.service;

import it.yudharta.peminjamanlcd.entity.Peminjaman;
import it.yudharta.peminjamanlcd.repository.PeminjamanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PeminjamanService {

    @Autowired
    PeminjamanRepository peminjamanRepository;

    public Iterable<Peminjaman> findAll() {
        return peminjamanRepository.findAll();
    }

    public Page<Peminjaman> findAll(Pageable pageable) {
        return peminjamanRepository.findAll(pageable);
    }
    
    public Peminjaman findOne(Integer id) {
        return peminjamanRepository.findOne(id);
    }

    public void save(Peminjaman peminjaman) {
        peminjamanRepository.save(peminjaman);
    }

    public void delete(Integer id) {
        peminjamanRepository.delete(id);
    }

}
