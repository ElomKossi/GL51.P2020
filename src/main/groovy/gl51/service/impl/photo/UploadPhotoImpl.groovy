package gl51.service.impl.photo

import gl51.data.photo.Photo
import gl51.data.photo.Thumbnail
import gl51.service.photo.UploadPhoto
import gl51.service.photo.ResizePhoto
import gl51.service.photo.GenerateThumbnail
import gl51.service.photo.StockInCloud
import gl51.service.photo.UpdateDatabase

import javax.inject.Inject

class UploadPhotoImpl implements UploadPhoto {

    @Inject
    ResizePhoto resizePhotoService

    @Inject
    GenerateThumbnail generateThumbnailService

    @Inject
    StockInCloud stockInCloudService

    @Inject
    UpdateDatabase UpdateDatabaseService

    @Override
    Boolean uploadPhoto() {
        Photo photo = resizePhotoService.resizePhoto()
        Thumbnail thumbnail = generateThumbnailService.generateThumbnail(photo)
        String coord = stockInCloudService.stockInCloud(photo, thumbnail)
        Boolean updated = UpdateDatabaseService.updateDatabase(coord)

        return updated
    }

}
