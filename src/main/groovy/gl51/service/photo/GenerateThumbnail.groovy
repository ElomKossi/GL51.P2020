package gl51.service.photo

import gl51.data.photo.Photo
import gl51.data.photo.Thumbnail

interface GenerateThumbnail {

    Thumbnail generateThumbnail(Photo photo)

}
