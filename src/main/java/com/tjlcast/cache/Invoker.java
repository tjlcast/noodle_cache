package com.tjlcast.cache;

/**
 * @author by tangjialiang
 * 时间 2018/8/10.
 * 说明 ...
 */
public interface Invoker<T> {

    /**
     * 从 数据源 获取数据
     * @return
     */
    T invoke();
}
