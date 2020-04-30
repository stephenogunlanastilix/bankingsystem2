
//Sets the display elements to variable display
let display = document.querySelector('#display');
//Sets microphone display elemets to the microphone variable
var microphone = document.getElementById('microphone');
//Microhpne action listenier

microphone.onclick = function () {
  microphone.classList.add('record');
       // Set the recognition api to Recognition variable
  var recognitionapi = new ( window.SpeechRecognition || 
    window.webkitSpeechRecognition || window.mozSpeechRecognition 
    || window.msSpeechRecognition)();
  recognitionapi.lang = "en-US";
  recognitionapi.start();
      //Error controls to make sure numbers are working
  errorcontrols = {
    "one": "1",
        "two": "2",
        "three": "3",
        "four": "4",
        "five": "5",
        "six": "6",
        "seven": "7",
        "eight": "8",
    "nine": "9",
    "to":"2",
  }
  recognitionapi.onresult = function (event){
    let display = document.querySelector('#display');
    var input = event.results[0][0].transcript;
     for(property in errorcontrols){
      input = input.replace(property , errorcontrols[property]);
      }
      setTimeout(function () {
        showinput(input);
      }, 1000);
      microphone.classList.remove('record');
  }
}
function showinput(input) {
  let display = document.querySelector('#display');
    try {
        var result = showinput(input);
        document.getElementById("display").value = input;
    }
    catch (e) {
        console.log(e);
        document.getElementById("display").value = " ";
    }
}