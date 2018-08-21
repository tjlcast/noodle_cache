package com.tjlcast.cache;

import java.util.Date;

/**
 * @author by tangjialiang
 * 时间 2018/8/10.
 * 说明 ...
 */
public interface Cache {

    String NULL = "0x00";

    /**
     * 查询一个 key 是否存在
     * @param key
     * @return 如果返回 true， 则说明存在
     */
    boolean exist(String key);

    /**
     * 删除一个 key
     * @param key
     */
    void delete(String key);

    /**
     * 设置一个过期时间
     * @param key
     * @param millisecond 毫秒
     */
    void expire(String key, long millisecond);

    /**
     * 直接对 cache 操作的 set/get 方法
     * @param key
     * @param value
     */
    void set(String key, Object value);
    <T> T getObject(String key);

    /**
     * 常用数据类型的接口
     * @param key
     * @return
     */
    String getString(String key);
    Integer getInt(String key);
    Long getLong(String key);
    Double getDouble(String key);
    Date getDate(String key);

    /**
     * 获取一个对象，如果对象存在缓存中，则从缓存中取出，如果不在缓存中，则执行方法获取 -- invoker
     * @param key
     * @param invocaker
     * @param second
     * @param <T>
     * @return
     */
    <T> T getObject(String key, Invoker<T> invocaker, int second);
}
