import altscript.js

var systemBatteryStatus (sysbatterystatus)
	get batteryType from "settings.groovy"

	draw "/icons/battery.gif"
		{
		width= 50 px;
		leginth= 25 px;
	}
		
		display batteryStatus show_type=persentage
		display BatteryStatus width=50 px
		display batteryStatus leginth= 25 px
		
var checkValidProductCode (validproductcode)
	get ProductCode(s) from "productcodes_01.csv" "productcodes_02.csv"
		
		checkValidProductCode if ProductCode dosnt match disable *.groovy *.js *.json *.csv
