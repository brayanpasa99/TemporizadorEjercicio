var h = 0;
var m = 1;
var s = 5;
var descanso = 1;
var actividad = false;
var interval;
//contador_regresivo() // 0 Dias 0 Horas 1 Minuto 20 Segundos

/*function contador_regresivo() {
 
 h = document.getElementById("hora")[0].value;
 descanso = document.getElementById("segdesc")[0].value;
 m = document.getElementById("minejer")[0].value;
 
 interval = setInterval(function () {
 setInter();
 innerHTML();
 // document.body.innerHTML = h+" h "+m+" m "+s+" s";
 }, 1000);
 }*/

function setInter() {

    if (s > 0 && s <= 60) {
        s--;
        if (s === 0) {
            actividad = true;
        } else if (s === descanso) {
            actividad = false;
        }
    } else if (m > 0 && m <= 60) {
        m--;
        s = 59;
    } else if (h > 0) {
        h--;
        m = 59;
        s = 59;
    } else {
        h = 0;
        m = 0;
        s = 0;
        clearInterval(interval);
        alert("Ejercicio Finalizado");
    }
}

function innerHTML() {
    document.getElementById("tiempo").innerHTML = h + ":" + m + ":" + s;
    if (actividad === true) {
        document.getElementById("estado").innerHTML = "Ejercitando";
    } else {
        document.getElementById("estado").innerHTML = "Descansando";
    }
}

$(document).ready(function () {
    h = document.getElementById("hora")[0].value;
    descanso = document.getElementById("segdesc")[0].value;
    m = document.getElementById("minejer")[0].value;

    interval = setInterval(function () {
        setInter();
        innerHTML();
        // document.body.innerHTML = h+" h "+m+" m "+s+" s";
    }, 1000);
});

