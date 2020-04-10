package gl51.service.impl.photo

import gl51.service.photo.UploadPhotoService
import gl51.service.photo.ResizePhotoService
import gl51.service.photo.MakeThumbnailService
import gl51.service.photo.StockInCloudService
import gl51.service.photo.UpdateDatabaseService
import gl51.data.photo.Photo

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UploadPhotoServiceImpl implements UploadPhotoService {

    @Inject
    ResizePhotoService resizePhotoService

    @Inject
    MakeThumbnailService makeThumbnailService

    @Inject
    StockInCloudService stockInCloudService

    @Inject
    UpdateDatabaseService updateDatabaseService

    @Override
    Boolean uploadPhoto() {
        //
        Photo photo = resizePhotoService.resizePhoto()
        Photo thumbnail = makeThumbnailService.makeThumbnail(photo)
        String coord = stockInCloudService.stockInCloud(photo, thumbnail)
        Boolean updated = updateDatabaseService.updateDatabase(coord)

        return updated
    }

}
