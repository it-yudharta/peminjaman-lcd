package it.yudharta.peminjamanlcd.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Peminjaman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "peminjam_id")
    private Integer peminjam_id;
    @Column(name = "barang_id")
    private Integer barang_id;
    @Column(name = "waktu_pinjam")
    private Integer waktu_pinjam;
    @Column(name = "waktu_kembali")
    private Integer waktu_kembali;
    @Size(max = 10)
    @Column(name = "lokasi")
    private String lokasi;
    @Size(max = 50)
    @Column(name = "kebutuhan")
    private String kebutuhan;
    @Column(name = "jatuh_tempo")
    private Integer jatuh_tempo;
    
    public Peminjaman() {
    }

    public Peminjaman(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPeminjamId() {
        return peminjam_id;
    }

    public void setPeminjamId(Integer peminjam_id) {
        this.peminjam_id = peminjam_id;
    }

    public Integer getBarangId() {
        return barang_id;
    }

    public void setBarangId(Integer barang_id) {
        this.barang_id = barang_id;
    }

    public Integer getWaktuPinjam() {
        return waktu_pinjam;
    }

    public void setWaktuPinjam(Integer waktu_pinjam) {
        this.waktu_pinjam = waktu_pinjam;
    }
    
    public Integer getWaktuKembali() {
        return waktu_kembali;
    }

    public void setWaktuKembali(Integer waktu_kembali) {
        this.waktu_kembali = waktu_kembali;
    }
    
    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    public String getKebutuhan() {
        return kebutuhan;
    }

    public void setKebutuhan(String kebutuhan) {
        this.kebutuhan = kebutuhan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjaman)) {
            return false;
        }
        Peminjaman other = (Peminjaman) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "it.yudharta.peminjamanlcd.entity.Peminjaman[ id=" + id + " ]";
    }
    
}
