package com.tjlcast.cache;

/**
 * @author by tangjialiang
 *         时间 2018/8/10.
 *         说明 ...
 */
public class AbstractCache implements Cache {

    @Override
    public <T> T getObject(String key, Invoker<T> invoker, int second) {

    }
}
