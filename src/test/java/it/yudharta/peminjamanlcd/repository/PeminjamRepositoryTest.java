package it.yudharta.peminjamanlcd.repository;

import it.yudharta.peminjamanlcd.entity.Peminjam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PeminjamRepositoryTest {
    
    @Autowired
    private PeminjamRepository peminjamRepository;
    
    @Test
    @Transactional
    public void testTambahDataPeminjam() {
        Peminjam b = new Peminjam("USER001", "LUTFI", "085606580648", "SUKOREJO", "INFORMATIKA", "MAHASISWA" );
        peminjamRepository.save(b);
        Peminjam peminjam = this.peminjamRepository.findByKode("USER001");
        assertThat(peminjam.getNama()).isEqualTo("LUTFI");
        assertThat(peminjam.getTelp()).isEqualTo("085606580648");
        assertThat(peminjam.getAlamat()).isEqualTo("SUKOREJO");
        assertThat(peminjam.getJurusan()).isEqualTo("INFORMATIKA");
        assertThat(peminjam.getDosen()).isEqualTo("MAHASISWA");
    }
}
