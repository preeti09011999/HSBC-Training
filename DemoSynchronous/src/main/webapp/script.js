function checkAvailabilityOfUsername(){
	let username = document.getElementById("username").value;
	let xhttp = new XMLHttpRequest();
	xhttp.open("GET", "http://localhost:8080/DemoSynchronous/check?username="+username, true);
	xhttp.send();
	console.log("Ok00");
	xhttp.onload = function(){
		console.log("Ok00");
		document.getElementById("error").innerHTML = xhttp.responseText;
	}
}
function loadData(){
	document.write("<table><tr><th>ID</th><th>Name</th></tr>");
	for(var i=0;i<jsonArray.length;i++){
		document.write("<tr><td>" + jsonArray[i].id + "</td><td>"+ jsonArray[i].name + "</td></tr>");
	}
	document.write("</table");
}
