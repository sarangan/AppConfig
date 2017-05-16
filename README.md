AppConfig Cordova Android Plugin
============

This plugin allows to store application configuration sensitive informations as key value pair which will be hidden from direct access

Installation
------------

### For Cordova 3.0.x:

1. To add this plugin just type: `cordova plugin add https://github.com/sarangan/AppConfig.git` or `phonegap local plugin add https://github.com/sarangan/AppConfig.git`
2. To remove this plugin type: `cordova plugin remove sara.vtwo.AppConfig` or `phonegap local plugin remove sara.vtwo.AppConfig`


Usage:
------

Call the `window.AppConfig(successCallback, failureCallback)` method by passing in your success and error callbacks:

### Example
```javascript
function onDeviceReady()
{
	var q = $q.defer();
	window.AppConfig.getConfig(
		function(config){
			//$log.log('config' , config);

			let key1 = config.Key1;
			let key2 = config.Key2;

			q.resolve({success: true});

		},
		function(err){
			$log.error(err);
			q.reject(err);
		}
);
}
```

The function will call your successCallback upon success, and failureCallback on failure.

## License

The MIT License

Copyright (c) 2016 sarangan (http://github.com/sarangan)

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
