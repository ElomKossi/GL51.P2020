package gl51.service.impl.photo

import gl51.data.photo.Photo

import gl51.service.photo.MakeThumbnailService
import javax.inject.Singleton

@Singleton
class MakeThumbnailServiceImpl implements MakeThumbnailService {

    @Override
    Photo makeThumbnail(Photo photo) {
        //
        photo.setPixels_x(50)
        photo.setPixels_y(50)
        return photo
    }

}
