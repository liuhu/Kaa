package org.kaaproject.kaa.server.common.dao.impl;

import java.nio.ByteBuffer;
import java.util.List;

/**
 * Created by liuhu on 3/9/16.
 */
public interface EndpointLogDao<T extends String> extends Dao<T, ByteBuffer> {
    /**
     * Find endpoint profile by key hash.
     *
     * @param endpointKeyHash the endpoint key hash
     * @return the endpoint profile object
     */
    List<T> findByKeyHash(String applicationToken, String endpointKeyHash);

}
