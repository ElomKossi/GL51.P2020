package gl51.service.impl.ip

import gl51.data.ip.Ip
import gl51.service.ip.IpService
import gl51.service.ip.IpConverterService

import javax.inject.Inject

class BinaryConverterServiceImpl implements IpConverterService {

    @Inject
    IpService service

    @Override
    String getAndConvertIp() {
        Ip ip = service.fetchIp()
        ///
    }

}
