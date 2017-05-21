package it.yudharta.peminjamanlcd.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
public class Peminjaman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "waktu_pinjam")
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuPinjam;
    @Column(name = "waktu_kembali")
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuKembali;
    @Size(max = 10)
    @Column(name = "lokasi")
    private String lokasi;
    @Size(max = 50)
    @Column(name = "kebutuhan")
    private String kebutuhan;
    @Column(name = "jatuh_tempo")
    private Integer jatuhTempo;
    @JoinColumn(name = "barang_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Barang barang;
    @JoinColumn(name = "peminjam_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Peminjam peminjam;

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

    public Date getWaktuPinjam() {
        return waktuPinjam;
    }

    public void setWaktuPinjam(Date waktuPinjam) {
        this.waktuPinjam = waktuPinjam;
    }

    public Date getWaktuKembali() {
        return waktuKembali;
    }

    public void setWaktuKembali(Date waktuKembali) {
        this.waktuKembali = waktuKembali;
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

    public Integer getJatuhTempo() {
        return jatuhTempo;
    }

    public void setJatuhTempo(Integer jatuhTempo) {
        this.jatuhTempo = jatuhTempo;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public Peminjam getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(Peminjam peminjam) {
        this.peminjam = peminjam;
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
