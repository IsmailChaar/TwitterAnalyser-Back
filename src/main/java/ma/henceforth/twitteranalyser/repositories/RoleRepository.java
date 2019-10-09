package ma.henceforth.twitteranalyser.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ma.henceforth.twitteranalyser.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);
}
