package gl51.service.impl.photo

import gl51.data.photo.Photo
import gl51.service.photo.ResizePhotoService
import javax.inject.Singleton

@Singleton
class ResizePhotoServiceImpl implements ResizePhotoService {

    @Override
    Photo resizePhoto(Photo photo) {
        //
        photo.setPixels_x(1024)
        photo.setPixels_y(1024)
        return photo
    }

}
