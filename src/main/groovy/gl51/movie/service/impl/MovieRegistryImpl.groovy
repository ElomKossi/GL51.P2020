package gl51.movie.service.impl

import gl51.movie.data.Movie

import javax.inject.Singleton

// Create test: Option + Enter
@Singleton
class MovieRegistryImpl implements gl51.movie.service.MovieRegistry {

    private List<Movie> internalRegistry = []

    @Override
    void addMovieToFavorites(String imdbID) {
        internalRegistry << new Movie(imdbID: imdbID)
    }

    @Override
    List<Movie> listFavorites() {
        internalRegistry
    }
}
