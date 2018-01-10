package dto;

import java.util.Date;

import model.Korisnik_servisa;
import model.Zgrada;

public class ObavestenjeDto {
	
	private Long id_obavestenje;
	private String ime;
	private String opis;
	private Date dat_kreiranja;
	private Korisnik_servisa kreator;
	private Zgrada zgrada;
	public Long getId_obavestenje() {
		return id_obavestenje;
	}
	public void setId_obavestenje(Long id_obavestenje) {
		this.id_obavestenje = id_obavestenje;
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
	public Korisnik_servisa getKreator() {
		return kreator;
	}
	public void setKreator(Korisnik_servisa kreator) {
		this.kreator = kreator;
	}
	public Zgrada getZgrada() {
		return zgrada;
	}
	public void setZgrada(Zgrada zgrada) {
		this.zgrada = zgrada;
	}
	
	public ObavestenjeDto(Long id_obavestenje, String ime, String opis, Date dat_kreiranja, Korisnik_servisa kreator,
			Zgrada zgrada) {
		super();
		this.id_obavestenje = id_obavestenje;
		this.ime = ime;
		this.opis = opis;
		this.dat_kreiranja = dat_kreiranja;
		this.kreator = kreator;
		this.zgrada = zgrada;
	}
	
	private ObavestenjeDto(){};
}
