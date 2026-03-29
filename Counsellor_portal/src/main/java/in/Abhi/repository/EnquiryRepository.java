package in.Abhi.repository;

import in.Abhi.entity.Enquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry,Integer> {

    List<Enquiry> findByCounseller_CounsellerId(Integer counsellerId);
}
