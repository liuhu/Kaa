package org.kaaproject.kaa.server.admin.client.mvp.view.endpoint;

import com.google.common.io.BaseEncoding;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.cellview.client.DataGrid;
import org.kaaproject.avro.ui.gwt.client.widget.grid.AbstractGrid;
import org.kaaproject.kaa.common.dto.EndpointStatusDto;
import org.kaaproject.kaa.server.admin.client.util.Utils;

/**
 * Created by liuhu on 3/7/16.
 */
public class EndpointStatusGrid extends AbstractGrid<EndpointStatusDto, String> {

    public EndpointStatusGrid(int pageSize) {
        super(Style.Unit.PX, false, pageSize);
    }

    @Override
    protected float constructColumnsImpl(DataGrid<EndpointStatusDto> dataGrid) {
        float prefWidth = 0;

        prefWidth += constructStringColumn(table,
                Utils.constants.keyHash(),
                new StringValueProvider<EndpointStatusDto>() {
                    @Override
                    public String getValue(EndpointStatusDto item) {
                        return BaseEncoding.base64().encode(item.getEndpointKeyHash());
                    }
                }, 160);

        prefWidth += constructStringColumn(table,
                Utils.constants.profileSchemaVersion(),
                new StringValueProvider<EndpointStatusDto>() {
                    @Override
                    public String getValue(EndpointStatusDto item) {
                        return item.getStatus() + "";
                    }
                }, 80);


        prefWidth += constructStringColumn(table,
                Utils.constants.logSchemaVersion(),
                new StringValueProvider<EndpointStatusDto>() {
                    @Override
                    public String getValue(EndpointStatusDto item) {
                        return item.getApplicationToken() + "";
                    }
                }, 80);

        prefWidth += constructStringColumn(table,
                Utils.constants.logSchemaVersion(),
                new StringValueProvider<EndpointStatusDto>() {
                    @Override
                    public String getValue(EndpointStatusDto item) {
                        return item.getTenantId() + "";
                    }
                }, 80);

        prefWidth += constructStringColumn(table,
                Utils.constants.logSchemaVersion(),
                new StringValueProvider<EndpointStatusDto>() {
                    @Override
                    public String getValue(EndpointStatusDto item) {
                        return item.getNodeId() + "";
                    }
                }, 80);

        return prefWidth;
    }

    @Override
    protected String getObjectId(EndpointStatusDto value) {
        return BaseEncoding.base64().encode(value.getEndpointKeyHash());
    }
}
