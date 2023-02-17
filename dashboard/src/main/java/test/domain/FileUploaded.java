package test.domain;

import java.util.*;
import lombok.Data;
import test.infra.AbstractEvent;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date uploadedTime;
    private String type;
    private String userId;
}
