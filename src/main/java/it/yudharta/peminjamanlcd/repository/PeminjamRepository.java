package it.yudharta.peminjamanlcd.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import it.yudharta.peminjamanlcd.entity.Peminjam;

public interface PeminjamRepository extends PagingAndSortingRepository<Peminjam, Integer>{
    
    Peminjam findByKode(String kode);
}
