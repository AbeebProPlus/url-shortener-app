package urlShortener.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
public class UrlLink {
    @Id
    private String urlId;
    private String originalUrl;
    private String shortenedUrl;
    private LocalDateTime creationTime = LocalDateTime.now();

    @Override
    public String toString(){
        return String.format("%s", getShortenedUrl());
    }
}
