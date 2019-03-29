api =(function(){
	
	return {
		getWeatherByCity:function(name, data){
		$get("/v1/weather/"+ name+ function(data)){
			callback(data)
		});
	}}
	
})();

		