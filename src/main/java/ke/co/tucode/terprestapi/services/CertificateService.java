package ke.co.tucode.terprestapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.tucode.terprestapi.entities.Certificate;
import ke.co.tucode.terprestapi.repositories.CertificateRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CertificateService {

    @Autowired
    private CertificateRepository repository;

    public void save(Certificate certificate){
        repository.save(certificate);
    }

    public List<Certificate> findAll(){
        return repository.findAll();
    }

    public Certificate findById(Long id){
        return repository.findById(id).get();
    }

    public boolean existsById(Long id){
        return repository.existsById(id);
    }

    public void update(Certificate certificate){
        repository.save(certificate);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void deleteAll(){
        repository.deleteAll();
    }
}
