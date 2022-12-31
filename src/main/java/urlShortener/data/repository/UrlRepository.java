package urlShortener.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import urlShortener.data.models.UrlLink;

public interface UrlRepository extends MongoRepository<UrlLink, String> {
    UrlLink findUrlLinkByShortenedUrl(String url);
}
