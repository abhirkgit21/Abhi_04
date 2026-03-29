package in.Abhi.repository;

import in.Abhi.entity.Counseller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounsellorRepository extends JpaRepository<Counseller,Integer> {

    Counseller findByEmail(String email);
}
