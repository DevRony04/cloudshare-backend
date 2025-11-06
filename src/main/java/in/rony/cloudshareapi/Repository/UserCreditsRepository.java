package in.rony.cloudshareapi.Repository;

import in.rony.cloudshareapi.document.UserCredits;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserCreditsRepository extends MongoRepository<UserCredits, String> {

}
