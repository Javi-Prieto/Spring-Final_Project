let pass = document.getElementById('passw');
let passR = document.getElementById('passwC');
function validatePassw(){
    let passV = document.getElementById('passw').value;
    let passRV = document.getElementById('passwC').value;
    if(passV != passRV ){
        document.getElementById('alertC').style.color = 'red';
        document.getElementById('alertC').innerHTML = 'Las contraseñas deben coincidir';
        document.getElementById('submitRg').disabled = true;
        document.getElementById('submitRg').style.opacity = (0.5);
    }else{
        document.getElementById('submitRg').disabled = false;
        document.getElementById('submitRg').style.opacity = (1);
        document.getElementById('alertC').style.color = 'green';
        document.getElementById('alertC').innerHTML = 'Las contraseñas coinciden';
    }
}
let showPsw = document.getElementById('showPsw');
let showPswR = document.getElementById('showPswR');
showPsw.addEventListener("click", function(){
    let type = pass.getAttribute("type") === "password" ? "text": "password";
    pass.setAttribute("type", type);

    this.classList.toggle("bi-eye");
});
showPswR.addEventListener("click", function(){
    let type = passR.getAttribute("type") === "password" ? "text": "password";
    passR.setAttribute("type", type);

    this.classList.toggle("bi-eye");
});

function validatePhone(){
    if(!document.getElementById('numTlf').value.match(/\d\d\d-\d\d\d-\d\d\d/i)){
        document.getElementById('alertP').style.color = 'red';
        document.getElementById('alertP').innerHTML = 'Número de Tlfno. incorrecto';
        document.getElementById('submitRg').disabled = true;
        document.getElementById('submitRg').style.opacity = (0.5);
    }else{
        document.getElementById('submitRg').disabled = false;
        document.getElementById('submitRg').style.opacity = (1);
    }
}
function validateDNI(){
    if(!document.getElementById('dni').value.match(/\w\w\w\w\w\w\w\d/i)){
        document.getElementById('alertD').style.color = 'red';
        document.getElementById('alertD').innerHTML = 'Número de Tlfno. incorrecto';
        document.getElementById('submitRg').disabled = true;
        document.getElementById('submitRg').style.opacity = (0.5);
    }else{
        document.getElementById('submitRg').disabled = false;
        document.getElementById('submitRg').style.opacity = (1);
    }
}


