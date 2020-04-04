package ag.ihopethisworkssequel;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocationRepository extends MongoRepository<Location, String>, QuerydslPredicateExecutor<Location> {
    Optional<Location> findById(String id);

    @Query(value = "{sportDetails.averagePrice:?0}")
    List<Location> findByAveragePriceLessThan(int maxPrice);
}
