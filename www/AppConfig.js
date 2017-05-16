//
//  AppConfig.js
//  AppConfig PhoneGap/Cordova plugin
//
//  Created by sara @ sphm on 31/03/2016.
//  MIT Licensed
//

module.exports = {

    getConfig: function (successCallback, failureCallback) {
        // successCallback required
        if (typeof successCallback !== "function") {
            console.log("AppConfig Error: successCallback is not a function");
        }
        else if (typeof failureCallback !== "function") {
            console.log("AppConfig Error: failureCallback is not a function");
        }
        else {
            return cordova.exec(successCallback, failureCallback, "AppConfig", "getConfig", []);
        }
    }
};