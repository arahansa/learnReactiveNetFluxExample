package guru.springramework.netfluxexampleorigin.domain;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@RequiredArgsConstructor
public class Movie {

    private String id;

    @NonNull
    private String title;


}
