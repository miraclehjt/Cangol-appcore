package mobi.cangol.mobile.service.session;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import mobi.cangol.mobile.service.AppService;

/**
 * @author Cangol
 */
public interface SessionService extends AppService {

    /**
     * 是否包含
     *
     * @param key
     */
    boolean containsKey(String key);

    /**
     * 是否包含
     *
     * @param value
     */
    boolean containsValue(Object value);

    /**
     * 获取Int
     *
     * @param key
     */
    int getInt(String key, int defValue);

    /**
     * 获取Boolean
     *
     * @param key
     */
    boolean getBoolean(String key, boolean defValue);

    /**
     * 获取Long
     *
     * @param key
     */
    long getLong(String key, long defValue);

    /**
     * 获取Float
     *
     * @param key
     */
    float getFloat(String key, float defValue);

    /**
     * 获取String
     *
     * @param key
     */
    String getString(String key, String defValue);

    /**
     * 获取String
     *
     * @param key
     */
    Set<String> getStringSet(String key, Set<String> defValue);

    /**
     * 获取JSONObject缓存
     *
     * @param key
     */
    JSONObject getJSONObject(String key);

    /**
     * 获取JSONArray缓存
     *
     * @param key
     */
    JSONArray getJSONArray(String key);

    /**
     * 获取Serializable缓存
     *
     * @param key
     */
    Serializable getSerializable(String key);

    /**
     * 存储int到内存和磁盘
     *
     * @param key
     */
    void saveInt(String key, int value);

    /**
     * 存储boolean到内存和磁盘
     *
     * @param key
     */
    void saveBoolean(String key, boolean value);

    /**
     * 存储Float到内存和磁盘
     *
     * @param key
     */
    void saveFloat(String key, float value);

    /**
     * 存储long到内存和磁盘
     *
     * @param key
     */
    void saveLong(String key, long value);

    /**
     * 存储String到内存和磁盘
     *
     * @param key
     */
    void saveString(String key, String value);

    /**
     * 存储StringSet到内存和磁盘
     *
     * @param key
     */
    void saveStringSet(String key, Set<String> value);

    /**
     * 存储JSONObject到内存和磁盘
     *
     * @param key
     */
    void saveJSONObject(String key, JSONObject value);

    /**
     * 存储JSONArray到内存和磁盘
     *
     * @param key
     */
    void saveJSONArray(String key, JSONArray value);

    /**
     * 存储Serializable到内存和磁盘
     *
     * @param key
     */
    void saveSerializable(String key, Serializable value);

    /**
     * 存储map到内存和磁盘
     *
     * @param map
     */
    void saveAll(Map<String, ?> map);

    /**
     * 获取缓存Object
     *
     * @param key
     */
    Object get(String key);

    /**
     * 缓存Object到内存
     *
     * @param key
     * @param value
     */
    void put(String key, Object value);

    /**
     * 缓存map到内存
     *
     * @param map
     */
    void putAll(Map<String, ?> map);

    /**
     * 删除磁盘缓存和内存缓存
     *
     * @param key
     */
    void remove(String key);

    /**
     * 刷新磁盘缓存和内存缓存
     */
    void refresh();

    /**
     * 清除磁盘缓存和内存缓存
     */
    void clearAll();

}
