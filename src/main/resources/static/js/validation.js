let pass = document.querySelector('.passw>input');
let passR = document.querySelector('.passwC>input');
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
    if(!document.querySelector('.numtlf>input').value.match(/\d\d\d-\d\d\d-\d\d\d/i)){
        document.querySelector('.numtlf>p').style.color = 'red';
        document.querySelector('.numtlf>p').innerHTML = 'Número de Tlfno. incorrecto';
        document.querySelector('.subm>input').disabled = true;
        document.querySelector('.subm>input').style.opacity = (0.5);
    }else{
        document.querySelector('.numtlf>p').style.color = 'green';
        document.querySelector('.numtlf>p').innerHTML = 'Número de Tlfno. correcto';
        document.querySelector('.subm>input').disabled = false;
        document.querySelector('.subm>input').style.opacity = (1);
    }
}
function validateDNI(){
    if(!document.querySelector('.dni>input').value.match(/\w\w\w\w\w\w\w\d/i)){
        document.querySelector('.dni>p').style.color = 'red';
        document.querySelector('.dni>p').innerHTML = 'DNI incorrecto';
        document.querySelector('.subm>input').disabled = true;
        document.querySelector('.subm>input').style.opacity = (0.5);
    }else{
        
        document.querySelector('.dni>p').style.color = 'green';
        document.querySelector('.dni>p').innerHTML = 'DNI correcto';
        document.querySelector('.subm>input').disabled = false;
        document.querySelector('.subm>input').style.opacity = (1);
    }
}
function validateBankAc(){
    if(!document.querySelector('.bank>input').value.match(/\w\w\d\d\d\d\d\d\d\d\d\d\d\d\d\d\d\d\d\d\d\d\d\d/i)){
        document.querySelector('.bank>p').style.color = 'red';
        document.querySelector('.bank>p').innerHTML = 'Cuenta del banco incorrecta';
        document.querySelector('.subm>input').disabled = true;
        document.querySelector('.subm>input').style.opacity = (0.5);
    }else{
        
        document.querySelector('.bank>p').style.color = 'green';
        document.querySelector('.bank>p').innerHTML = 'Cuenta del banco correcta';
        document.querySelector('.subm>input').disabled = false;
        document.querySelector('.subm>input').style.opacity = (1);
    }
}
function validateBirth(){
    if(document.querySelector('.date>input').value >= Date.now()){
        let alertB = document.createElement('p')
        alertB.style.color = 'red'
        alertB.innerHTML = 'La fecha no puede ser superior al día de hoy';
        document.querySelector('.date').append(alertB)
        document.querySelector('.subm>input').disabled = true;
        document.querySelector('.subm>input').style.opacity = (0.5);
    }else{
        document.querySelector('.subm>input').disabled = false;
        document.querySelector('.subm>input').style.opacity = (1);
    }
}

