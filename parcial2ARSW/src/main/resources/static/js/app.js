app=(function(){
	
	var buscar=function(param){
		var tabla = $("#tablaWeather");
		var tableHeaderRowCount = 1;
		var table = document.getElementById('tablaWeather');
		var rowCount = table.rows.length;
		for (var i = tableHeaderRowCount; i < rowCount; i++) {
		    table.deleteRow(tableHeaderRowCount);
		}
		
	
		tabla.append("<tr><td>hola</td></tr>")
			
		
	}
	
	getWeather:function(city){
		return api.getWeatherBycity(city,buscar);
	}
		

})();