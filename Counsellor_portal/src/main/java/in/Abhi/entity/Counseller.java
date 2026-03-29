package in.Abhi.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;


@Entity
@Table(name = "counseller")
@Data
public class Counseller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int counsellerId;

    private String name;

    private String email;

    private String password;

    private String phoneNumber;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedDate;


}
