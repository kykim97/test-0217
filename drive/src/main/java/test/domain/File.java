package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.DriveApplication;
import test.domain.FileUploaded;

@Entity
@Table(name = "File_table")
@Data
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Long size;

    private Date uploadedTime;

    private String type;

    private String userId;

    @PostPersist
    public void onPostPersist() {
        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();
    }

    public static FileRepository repository() {
        FileRepository fileRepository = DriveApplication.applicationContext.getBean(
            FileRepository.class
        );
        return fileRepository;
    }
}
