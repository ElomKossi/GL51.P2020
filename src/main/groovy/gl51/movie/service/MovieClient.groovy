package gl51.movie.service

import gl51.movie.data.Movie

interface MovieClient {

    /**
     * get a movie details from the internet
     * @param imdbID
     * @return
     */
    Movie getMovieDetail(String imdbID)

}