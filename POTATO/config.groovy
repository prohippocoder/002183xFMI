//POTATO
//COPYRIGHT 2014 2015
//DEFAULT SETTINGS SCRIPT

import productcodes_01.csv
import productcodes_02.csv
import start_script.js
import settings.groovy
import altscript.js

{
	firmware_ver: 0.0.1
		ver_codename: "CodeName Sponge"
		ver_type: "USB"
		demo_ver: 0.0.1
			demo_enabled: true
	genuine_ver: true
	
		product_code: "0N02J7Q0TUKWZFB0"
		code_list: "productcodes_01.csv"
		code_list: "productcodes_02.csv"
			admin_ver: true
			
	device_name: 0x993658-FMI
		virutal_device: false
		physical_device: true
		developer_device: true
		
	usercount: 2
		account01: demo
			account01 demo_enabled: true
		account02: admin
			account02 demo_enabled: false
			
	device_size: 7.99 GB
		rounding_size: 8 GB
}
