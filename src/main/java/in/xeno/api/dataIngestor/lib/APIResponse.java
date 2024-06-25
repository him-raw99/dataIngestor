package in.xeno.api.dataIngestor.lib;


import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class APIResponse<T> {
    public int statusCode;
    public String message;
    public T data;
    public boolean success;
}
