package ma.henceforth.twitteranalyser.repositories;

import ma.henceforth.twitteranalyser.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
}