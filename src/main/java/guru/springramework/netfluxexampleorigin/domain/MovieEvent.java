package guru.springramework.netfluxexampleorigin.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
public class MovieEvent {

    private String movieId;
    private Date date;
}
