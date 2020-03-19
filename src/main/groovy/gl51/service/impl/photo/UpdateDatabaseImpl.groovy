package gl51.service.impl.photo

import gl51.service.photo.StockInCloud
import gl51.service.photo.UpdateDatabase
import gl51.service.photo.UploadPhoto

import javax.inject.Inject

class UpdateDatabaseImpl implements UpdateDatabase {

    @Inject
    StockInCloud stockInCloud

    @Override
    Boolean updateDatabase(String coord) {
        return null
    }

}
