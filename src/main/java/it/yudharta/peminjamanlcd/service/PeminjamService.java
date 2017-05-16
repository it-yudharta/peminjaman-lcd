package it.yudharta.peminjamanlcd.service;

import it.yudharta.peminjamanlcd.entity.Peminjam;
import it.yudharta.peminjamanlcd.repository.PeminjamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PeminjamService {

    @Autowired
    PeminjamRepository peminjamRepository;

    public Iterable<Peminjam> findAll() {
        return peminjamRepository.findAll();
    }

    public Page<Peminjam> findAll(Pageable pageable) {
        return peminjamRepository.findAll(pageable);
    }
    
    public Peminjam findOne(Integer id) {
        return peminjamRepository.findOne(id);
    }

    public void save(Peminjam peminjam) {
        peminjamRepository.save(peminjam);
    }

    public void delete(Integer id) {
        peminjamRepository.delete(id);
    }

}
