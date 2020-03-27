package gl51.movie.service.impl

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class MovieRegistryImplTest extends Specification {

    @Inject
    MovieRegistryImpl registry

    void "Injection should work"() {
        expect:
        registry != null
    }

    void "Favorite shold be empty"() {
        expect:
        registry.listFavorites() == []
    }

    void "adding a favorite should fill in he database"() {
        when:
            registry.addMovieToFavorites("aaaa")
        then:
            registry.listFavorites().size() == 1
    }

}
