package sara.vtwo.AppConfig;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;
import android.os.Environment;

/**
 * AppConfig.java
 * this class to hide sensitive imformation
 */
public class AppConfig extends CordovaPlugin {
    public static final String ACTION = "getConfig";
    private static final String TAG = "HWZAPPCONFIG";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        if (action.equals(ACTION)) {
            /* this is the HWZ APP configuration setting. */

            Log.e(TAG, "HWZ AppConfig");

            JSONObject r = new JSONObject();
            r.put("KEY1", "****************");
            r.put("KEY2", "****************");
            r.put("KEY3", "****************");
            r.put("KEY4", "****************");
            r.put("KEY5", "****************");

            callbackContext.success(r);

            return true;
        } else {
            Log.e(TAG, "Wrong action was provided: "+action);
            return false;
        }
    }
}
