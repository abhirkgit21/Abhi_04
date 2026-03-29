package in.Abhi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "enquiry")
@Data
public class Enquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer enquiryId;
    private String studentName;
    private String studentPhoneNo;
    private String courseName;
    private String classMode;
    private String enquiryStatus;

    private Timestamp createdDate;
    private Timestamp updatedDate;

    @ManyToOne
    @JoinColumn(name="counseller_id")
    private Counseller counseller;

}
