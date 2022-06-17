package ke.co.tucode.terprestapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ke.co.tucode.terprestapi.entities.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}
