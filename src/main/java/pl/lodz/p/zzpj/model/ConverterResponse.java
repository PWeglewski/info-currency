package pl.lodz.p.zzpj.model;

/**
 * Converter response for view-model operations.
 */
public class ConverterResponse {
    Object data;
    int statusCode;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getData() {

        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
