package zw.co.arfel.clothing.model;

/**
 * Created by dilonne on 7/13/17.
 */
public class ServerResponse {
    private Integer success;
    private String message;

    /**
     * No args constructor for use in serialization
     */
    public ServerResponse() {
    }

    /**
     * @param message
     * @param success
     */
    public ServerResponse(Integer success, String message) {
        super();
        this.success = success;
        this.message = message;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
