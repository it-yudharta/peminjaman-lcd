package it.yudharta.peminjamanlcd.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import it.yudharta.peminjamanlcd.entity.Peminjaman;

public interface PeminjamanRepository extends PagingAndSortingRepository<Peminjaman, Integer>{
    
    Peminjaman findByKode(String kode);
}
