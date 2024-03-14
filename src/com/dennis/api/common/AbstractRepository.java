package com.dennis.api.common;
import java.io.IOException;
import java.util.Map;

public abstract class AbstractRepository {
    public abstract Map<String, ?> save(Map<String, ?> paraMap) throws IOException;
    public abstract Map<String, ?> find(Map<String, ?> paraMap) throws IOException;
}
