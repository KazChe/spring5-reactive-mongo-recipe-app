package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by jt on 6/13/17.
 */

public class UnitOfMeasure {

    @Id
    private String id;
    private String description;
}
