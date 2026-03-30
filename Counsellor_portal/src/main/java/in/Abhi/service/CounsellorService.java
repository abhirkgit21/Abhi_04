package in.Abhi.service;

import in.Abhi.entity.Counseller;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface CounsellorService {

    String register(Counseller counsellor);

    Counseller login(String email, String password);

    Map<String, Integer> getDashboard(Integer counsellorId);
}
