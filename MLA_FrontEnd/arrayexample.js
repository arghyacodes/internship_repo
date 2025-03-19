let names = ["Java" ,".Net" , "Python", "C++"];

console.log(names); //for backend

for(i =0; i<names.length; i++){
    document.writeln(names[i]+"<br>");  //for web frontend
}


let list = new Array();

list[0] = "Cheems";
list[1] = "Dogesh";
list[2] = "Selmon";
list[3] = "Dogelina";

list.forEach(element => {
    document.writeln("<br>"+element+"<br>");
});

// another one

/*

        let date = new Date();
        let day = date.getDate();
        let month = date.getMonth();
        let year = date.getFullYear();
        let hour = date.getHours();

        document.writeln(date+"<br>");
        document.writeln("Hour : "+hour+"<br>");
        document.writeln("Day : "+day+"<br>");
        document.writeln("Month : "+month+"<br>");
        document.writeln("Year : "+year+"<br>");
        document.getElementById("txt").innerHTML=date;
*/