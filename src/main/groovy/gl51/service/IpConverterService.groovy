package gl51.service;

import gl51.data.Ip;

/**
 * ceci convertit des IP en string
 */

interface IpConverterService {

    /**
     * convertit une IP en string
     * @param ip l'ip a convertir
     * @return
     */

    String getAndConvertIp()
}