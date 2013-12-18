/** 
 * Copyright (c) 2013 Cangol.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package mobi.cangol.mobile.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description Serv.java
 * @author Cangol
 * @date 2013-10-31
 */
public class ServiceProperty {
	private String mName;
	private Map<String, Object> mMap;

	public ServiceProperty(String name) {
		this.mName = name;
		mMap = new HashMap<String, Object>();
	}

	public String getName() {
		return mName;
	}

	public void putString(String key, String value) {
		mMap.put(key, value);
	}

	public String getString(String key) {
		Object o = mMap.get(key);
		if (o == null) {
			return null;
		}
		try {
			return (String) o;
		} catch (ClassCastException e) {
			return null;
		}
	}

	public void putInt(String key, int value) {
		mMap.put(key, value);
	}
	public int getInt(String key) {
	        return getInt(key, 0);
    }
	public int getInt(String key, int defaultValue) {
		Object o = mMap.get(key);
		if (o == null) {
			return defaultValue;
		}
		try {
			return (Integer) o;
		} catch (ClassCastException e) {
			return defaultValue;
		}
	}
	
	public void putDouble(String key, double value) {
		mMap.put(key, value);
	}
	public double getDouble(String key) {
        return getDouble(key, 0.0d);
    }
	public double getDouble(String key, double defaultValue) {
		Object o = mMap.get(key);
		if (o == null) {
			return defaultValue;
		}
		try {
			return (Double) o;
		} catch (ClassCastException e) {
			return defaultValue;
		}
	}

	public void putBoolean(String key, boolean value) {
		mMap.put(key, value);
	}
	public boolean getBoolean(String key) {
        return getBoolean(key, false);
    }
	public boolean getBoolean(String key, boolean defaultValue) {
		Object o = mMap.get(key);
		if (o == null) {
			return defaultValue;
		}
		try {
			return (Boolean) o;
		} catch (ClassCastException e) {
			return defaultValue;
		}
	}

	public void putLong(String key, Long value) {
		mMap.put(key, value);
	}
	public long getLong(String key) {
        return getLong(key, 0L);
    }
	public long getLong(String key, long defaultValue) {
		Object o = mMap.get(key);
		if (o == null) {
			return defaultValue;
		}
		try {
			return (Long) o;
		} catch (ClassCastException e) {
			return defaultValue;
		}
	}

	public void putFloat(String key, Float value) {
		mMap.put(key, value);
	}
	public float getFloat(String key) {
        return getFloat(key, 0f);
    }
	public float getFloat(String key, float defaultValue) {
		Object o = mMap.get(key);
		if (o == null) {
			return defaultValue;
		}
		try {
			return (Float) o;
		} catch (ClassCastException e) {
			return defaultValue;
		}
	}
}