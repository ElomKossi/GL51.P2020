package gl51.service.photo

import gl51.data.photo.Photo
import gl51.data.photo.Thumbnail;

interface StockInCloud {

    String stockInCloud(Photo photo, Thumbnail thumbnail)

}
