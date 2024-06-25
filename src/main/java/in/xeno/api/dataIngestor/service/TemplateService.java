package in.xeno.api.dataIngestor.service;

import in.xeno.api.dataIngestor.constants.ProxyAction;
import in.xeno.api.dataIngestor.lib.ProxyRequest;

public abstract class TemplateService<T> {
    public void handleRequest(ProxyAction action, T payload){
        switch (action){
            case ProxyAction.ADD:
                this.save(payload);
                break;
            case ProxyAction.DELETE:
                this.delete(payload);
                break;
            case ProxyAction.UPDATE:
                this.update(payload);
                break;
            default:
                System.out.println("NO SUCH ACTION EXISTS");
        }
    }
    public abstract T save(T data);
    public abstract T update(T data);
    public abstract T delete(T data);
}
