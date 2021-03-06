package co.com.bancolombia.mongo;

import co.com.bancolombia.model.persona.Persona;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepository extends ReactiveMongoRepository<Persona, String>, ReactiveQueryByExampleExecutor<Persona> {
}
