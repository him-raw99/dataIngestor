package in.xeno.api.dataIngestor.lib;


import in.xeno.api.dataIngestor.constants.ProxyAction;
import in.xeno.api.dataIngestor.constants.ProxyContext;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ProxyRequest<T> {
    public ProxyContext context;
    public ProxyAction action;
    public T data;
}
