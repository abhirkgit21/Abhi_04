package in.Abhi.service;

import in.Abhi.entity.Counseller;
import in.Abhi.entity.Enquiry;
import in.Abhi.repository.CounsellorRepository;
import in.Abhi.repository.EnquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CounsellorServiceImp implements CounsellorService{

    @Autowired
    private CounsellorRepository counsellorRepository;

    @Autowired
    private EnquiryRepository enquiryRepository;


    @Override
    public String register(Counseller counsellor) {
        counsellorRepository.save(counsellor);
        return "Registration successful";
    }

    @Override
    public Counseller login(String email, String password) {
      Counseller c =  counsellorRepository.findByEmail(email);
      if (c!=null && c.getPassword().equals(password)){
          return c;
      }
        return null;
    }

    @Override
    public Map<String, Integer> getDashboard(Integer counsellorId) {

        List<Enquiry> list = enquiryRepository.findByCounseller_CounsellerId(counsellorId);

        int total = list.size();
        int open = 0, enrolled = 0, lost = 0;

        for (Enquiry e : list) {
            if ("OPEN".equalsIgnoreCase(e.getEnquiryStatus())) open++;
            else if ("ENROLLED".equalsIgnoreCase(e.getEnquiryStatus())) enrolled++;
            else if ("LOST".equalsIgnoreCase(e.getEnquiryStatus())) lost++;
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("total", total);
        map.put("open", open);
        map.put("enrolled", enrolled);
        map.put("lost", lost);

        return map;
    }
}
