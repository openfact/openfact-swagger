package org.openfact.rest.idm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

@ApiModel
public class SearchResultsRepresentation<T> {

    @ApiModelProperty(
            value = "Comprobantes que cumplen con el query. Los resultados son paginados y devuelven por defecto máximo 10 elementos"
    )
    private List<T> items = new ArrayList<>();

    @ApiModelProperty(
            value = "Total de comprobantes que cumplen con el query"
    )
    private int totalSize;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

}
