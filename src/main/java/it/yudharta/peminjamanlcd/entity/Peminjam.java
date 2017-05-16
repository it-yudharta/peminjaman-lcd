package it.yudharta.peminjamanlcd.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

@Entity
public class Peminjam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "kode")
    private String kode;
    @Size(max = 50)
    @Column(name = "nama")
    private String nama;
    @Size(max = 20)
    @Column(name = "telp")
    private String telp;
    @Size(max = 50)
    @Column(name = "alamat")
    private String alamat;
    @Size(max = 30)
    @Column(name = "jurusan")
    private String jurusan;
    @Size(max = 25)
    @Column(name = "dosen")
    private String dosen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peminjam")
    private Collection<Peminjaman> peminjaman;

    public Peminjam() {
    }

    public Peminjam(String kode, String nama, String telp, String alamat, String jurusan, String dosen) {
        this.kode = kode;
        this.nama = nama;
        this.telp = telp;
        this.alamat = alamat;
        this.jurusan = jurusan;
        this.dosen = dosen;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    @XmlTransient
    public Collection<Peminjaman> getPeminjaman() {
        return peminjaman;
    }

    public void setPeminjaman(Collection<Peminjaman> peminjaman) {
        this.peminjaman = peminjaman;
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
        if (!(object instanceof Peminjam)) {
            return false;
        }
        Peminjam other = (Peminjam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "it.yudharta.peminjamanlcd.entity.Peminjam[ id=" + id + " ]";
    }
    
}
