package service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import model.Komentar;
import model.Korisnik_servisa;
import model.Kvar;
import model.Obavestenje;
import repository.KomentarRepository;


public class KomentarService {

	@Autowired
	private KomentarRepository komentarRepository;
	
	public List<Komentar> findByKvar(Kvar kvar) {
		return komentarRepository.findByKvar(kvar);
	}
	
	public List<Komentar> findByOwner(Korisnik_servisa kreator){
		return komentarRepository.findByOwner(kreator);
	}
	
	public Komentar findOneById(Long id_komentar){
		return komentarRepository.findOneById(id_komentar);
	}

	public List<Komentar> findAll(){
		return komentarRepository.findAll();
	}
	
	public Komentar  save(Komentar komentar){
		return komentarRepository.save(komentar);
	}
	
	public void delete(Komentar komentar){
		 komentarRepository.delete(komentar);
	}
}
