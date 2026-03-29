package in.Abhi.dto;

import jakarta.persistence.Entity;
import lombok.Data;


@Data
public class EnquiryRequest {
    private String studentName;
    private String studentPhoneNo;
    private String courseName;
    private String classMode;
    private String enqStatus;
}
