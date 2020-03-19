package gl51.service.photo

import gl51.data.photo.Photo

interface StockInCloudService {

    String stockInCloud(Photo photo, Photo thumbnail)

}
