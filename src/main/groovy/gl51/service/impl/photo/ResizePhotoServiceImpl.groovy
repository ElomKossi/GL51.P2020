package gl51.service.impl.photo

import gl51.data.photo.Photo
import gl51.service.photo.ResizePhotoService
import javax.inject.Singleton

@Singleton
class ResizePhotoServiceImpl implements ResizePhotoService {

    @Override
    Photo resizePhoto(Photo photo) {
        //
        photo.setPixelsX(1024)
        photo.setPixelsY(1024)
        return photo
    }

}
