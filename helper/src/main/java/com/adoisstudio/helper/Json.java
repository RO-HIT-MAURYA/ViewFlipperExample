package com.adoisstudio.helper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by amitkumar on 16/01/18.
 */

public class Json extends JSONObject {

    private static String TAG = "Json";

    public Json() {
    }

    public Json(String json) throws JSONException {
        super(json);
    }

    public void addBool(String param, boolean val) {
        try {
            put(param, val);
        } catch (JSONException e) {
            H.log(TAG, e.toString());
        }
    }//add bool

    public void addInt(String param, int val) {
        try {
            put(param, val);
        } catch (JSONException e) {
            H.log(TAG, e.toString());
        }
    }//add bool

    public void addString(String param, String val) {
        try {
            put(param, val);
        } catch (JSONException e) {
            H.log(TAG, e.toString());
        }
    }//add bool

    public void addLong(String param, long val) {
        try {
            put(param, val);
        } catch (JSONException e) {
            H.log(TAG, e.toString());
        }
    }//add bool

    public void addJSON(String param, JSONObject val) {
        try {
            put(param, val);
        } catch (JSONException e) {
            H.log(TAG, e.toString());
        }
    }//add bool

    public void addJSONArray(String param, JSONArray val) {
        try {
            put(param, val);
        } catch (JSONException e) {
            H.log(TAG, e.toString());
        }
    }//add bool


    public int getInt(String param) {
        try {
            return super.getInt(param);
        } catch (Exception e) {
            H.log(TAG, e.toString());
        }
        return 0;
    }

    public boolean getBoolean(String param) {
        try {
            return super.getBoolean(param);
        } catch (JSONException e) {
            H.log(TAG, e.toString());
        }
        return false;
    }

    public String getString(String param) {
        try {
            return super.getString(param);
        } catch (JSONException e) {
            H.log(TAG, e.toString());
        }
        return "";
    }

    public Json getJson(String param) {
        try {
            return new Json(super.getJSONObject(param).toString());
        } catch (JSONException e) {
            H.log(TAG, e.toString());
        }
        return new Json();
    }

    public JSONObject getJsonObject(String param) {
        try {
            return super.getJSONObject(param);
        } catch (JSONException e) {
            H.log(TAG, e.toString());
        }
        return new JSONObject();
    }

    public JSONArray getJsonArray(String param) {
        try {
            return super.getJSONArray(param);
        } catch (JSONException e) {
            H.log(TAG, e.toString());
        }
        return new JSONArray();
    }

    public JSONArray getNewJsonArray(String json) {
        JSONArray array;
        try {
            array = new JSONArray(json);
        } catch (JSONException e) {
            H.log(TAG, e.toString());
            array = new JSONArray();
        }
        return array;
    }


}//class