package org.kaaproject.kaa.server.common.dao.impl;

import org.kaaproject.kaa.common.dto.EndpointStatusDto;
import org.kaaproject.kaa.server.common.dao.model.EndpointStatus;

import java.nio.ByteBuffer;
import java.util.List;

/**
 * Created by liuhu on 3/4/16.
 */
public interface EndpointStatusDao<T extends EndpointStatus> extends Dao<T, ByteBuffer>  {
    /**
     *
     * @param dto
     * @return
     */
    T save(EndpointStatusDto dto);

    /**
     * Find endpoints list by application token
     * @param applicationToken application Token
     * @return endpoints list
     */
    List<T> findByApplicationToken(String applicationToken);


    /**
     *
     * @param endpointKeyHash
     * @param nodeId
     * @return
     */
    T findEndpointStatusByKeyHashAndNodeId(byte[] endpointKeyHash, String nodeId);

}
