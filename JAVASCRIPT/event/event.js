function sayHello(){
    alert('Hello!!!!');
}


let p=document.getElementById('id1');
p.onclick=function(){
    let p1=window.prompt("your name is");
    document.getElementById('a').innerHTML=""+p1;
}



function createpElement(){
    let s=document.createElement('p');
    s.textContent='sdasd';
    document.body.appendChild(s);
}



button1.addEventListener('click',function(){
    alert("good evening")
})



let d=document.createElement('h1');
function showtext(){
let  ie=document.getElementById('data');
console.log(ie.value);

d.textContent=ie.value;
document.body.appendChild(d);
}