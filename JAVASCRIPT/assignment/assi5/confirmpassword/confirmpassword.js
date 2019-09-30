function validateForm(){
    let s=document.forms[0];
    
    // console.log(s);
    // console.log(s.uname.value);
    let username=s.uname.value;
    let password=s.pass.value;
    if(username.length>4) {
        console.log('success');
        s.uname.style.border='4px solid green';
        //s.pass.style.border='4px solid green';
        let q2=document.getElementById('id1');
q2.textContent="";
        s.loginsubmit.disabled=false;
        
    }
    else{
        s.uname.style.border='4px solid red'
       // s.pass.style.border='4px solid red'
        let w=document.getElementById('id1');
        w.textContent="follow the pattern or invalid username";
        
        s.loginsubmit.disabled=true;
    }
}

function validatePass(){
    let s1=document.forms[0];
    let password=s1.pass.value;
    if(password.length>7){
        console.log('success');
        s1.pass.style.border='4px solid green';
        let q1=document.getElementById('id2');
        q1.textContent="";

    }
    else{
        s1.pass.style.border='4px solid red';
let q=document.getElementById('id2');
q.textContent="follow the pattern or invalid password";
    }
}


function validateconf(){
    let r=document.forms[0];

    let r1=r.pass.value;
    let r2=r.passw.value;
    
    if(r1===r2){
        let n=document.getElementById('id3');
n.textContent="";
    }
    else{
        let n1=document.getElementById('id3');
n1.textContent="incorrect";
    }
} 