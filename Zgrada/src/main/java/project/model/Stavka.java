package project.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Stavka {

	@Id
	@GeneratedValue
	private Long id_stavke;
	
	private String ime;
	private String opis;
	private Date dat_kreiranja;
		
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Korisnik_servisa kreator;//kreator koji je kreirao zapisnik
	
	@ManyToMany
    @JoinTable(name = "stavkeNaSednici",
               joinColumns = @JoinColumn(name="id_stavke", referencedColumnName="id_stavke"),
               inverseJoinColumns = @JoinColumn(name="id_sednice", referencedColumnName="id_sednice"))
	private Set<Sednica> sednica = new HashSet<Sednica>();
	
	public Long getId_stavke() {
		return id_stavke;
	}
	public Korisnik_servisa getKreator() {
		return kreator;
	}
	public void setKreator(Korisnik_servisa kreator) {
		this.kreator = kreator;
	}
	public Set<Sednica> getSednica() {
		return sednica;
	}
	public void setSednica(Set<Sednica> sednica) {
		this.sednica = sednica;
	}
	public void setId_stavke(Long id_stavke) {
		this.id_stavke = id_stavke;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public Date getDat_kreiranja() {
		return dat_kreiranja;
	}
	public void setDat_kreiranja(Date dat_kreiranja) {
		this.dat_kreiranja = dat_kreiranja;
	}
}