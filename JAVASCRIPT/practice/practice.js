// function ValidateForm(){
//     let i=document.forms[0];
//     let j=i.name.value;
    
//     if(j.length>=6){
//         console.log("success");
//         i.name.style.border='4px solid green';
//         let r=document.getElementById('i2');
//         r.textContent='';
//         i.login.disabled=false;
//     }else{
//         console.log("fail");
//         i.name.style.border='4px solid red';
//         let r2=document.getElementById("i2");
//         r2.textContent='length must be greter than 6'
//         i.login.disabled=true;
//     }
// }

// function ValidatePass(){
//     let s=document.forms[0];
//     let p=s.password.value;
//     if(p.length>=6){
//         console.log("success");
//         s.password.style.border='4px solid green';
//         let r3=document.getElementById('i4');
//         r3.textContent='';
//         s.login.disabled=false;
//     }else{
//         console.log("fail");
//         s.password.style.border='4px solid red';
//         let r4=document.getElementById('i4');
//         r4.textContent='length must be greter than 6'
//         s.login.disabled=true;
//     }
// }

// function ValidateConf(){
//     let n=document.forms[0];
//     let x=n.pass.value;
//     let xx=n.password.value;

//     if(x===xx){
//         console.log("success");
//         n.pass.style.border='4px solid green';
//         let r5=document.getElementById('i5');
//         r5.textContent='correct';
//         n.login.disabled=true;

//     }
//     else{
//         n.pass.style.border='4px solid red';
//         let r5=document.getElementById('i5');
//         r5.textContent='not matching';
//         n.login.disabled=true;


//     }
// }


//************************************************************************ */

// let table=document.createElement('table');

// let tr=document.createElement('tr');
// table.appendChild(tr);

// let th1=document.createElement('th');
// th1.textContent='NAME';
// tr.appendChild(th1);

// let th2=document.createElement('th');
// th2.textContent='AGE';
// tr.appendChild(th2);

// let tr1=document.createElement('tr');
// table.appendChild(tr1);

// let th3=document.createElement('th');
// th3.textContent='shweta';
// tr1.appendChild(th3);

// let th4=document.createElement('th');
// th4.textContent='12';
// tr1.appendChild(th4);

// th1.style.border='1px solid black';
// th2.style.border='1px solid black';
// th3.style.border='1px solid black';
// th4.style.border='1px solid black';

// table.style.border='1px solid black';

// document.body.append(table);
//************************************************************** */
// let form=document.createElement('form');
// form.setAttribute('action','');

// let label=document.createElement('label');
// label.textContent='Name';
// form.appendChild(label);

// let br1=document.createElement('br');
// form.appendChild(br1);

// let uname=document.createElement('input');
// uname.setAttribute("type","text");
// uname.setAttribute("name","name");
// form.appendChild(uname)

// let br2=document.createElement('br');
// form.appendChild(br2);

// let label2=document.createElement('label');
// label2.textContent='Password';
// form.appendChild(label2);

// let br3=document.createElement('br');
// form.appendChild(br3);

// let pass=document.createElement('input');
// pass.setAttribute("type","password");
// pass.setAttribute("name","name");
// form.appendChild(pass)

// let br4=document.createElement('br');
// form.appendChild(br4);

// let but=document.createElement('button');
// but.setAttribute("type","submit");
// but.textContent="Login";
// form.appendChild(but);

// form.style.border='2px solid black';
// form.style.width='500px';

// document.body.appendChild(form);
//**************************************************************************** */




// function send(){
//     alert("use 50% data");
//     confirm('are u confirm?');
//     let p3=window.prompt('whats ur name');
//     document.getElementById('h1').innerHTML=""+p3;
    
// }

// let a1=document.getElementById('b3');
// a1.onclick=function(){
// let a2=document.createElement('p');
// a2.textContent='shweta';
// document.body.appendChild(a2);
// }


// shweta.addEventListener('click',function(){
//     alert('hello shweta');
// })

// let x=document.createElement('h1');
// function data(){
//     let xx=document.getElementById('data');
//     x.textContent=xx.value;
//     document.body.appendChild(x);
// }

//****************************************PROMISE************************************************ */

// let a=new Promise(function(resolve,reject){
//     emplyee=[{
//         name:shweta,
//         age:21
//     }]
//     if(9<10){
//         resolve(emplyee);
//     }
//     else{
//         reject("fail");
//     }
// })
// a.then(data=>{
//     console.log("data:::"+data);
//     return data;
// }).catch(err=>{
//     console.log(err);
// })

//***************************************ARRAY****************************************** */
// let arr=['shweta','jadhav','namrata','namu'];
// console.log(arr);

// let arr2=new Array();
// arr2[0]=1;
// arr2[1]=2;
// arr2[2]=3;
// arr2[3]=4;
// console.log(arr2);

// for(let i of arr){
//     console.log(i);
// }

// for(let j in arr){
//     console.log(arr[j]);
// }

// arr2.forEach(function(value,index){
//     console.log("array"+value);
// })

//********************************OBJECT**************************************** */
// let a=new Object();
// a.name='shweta';
// a.age=22;
// console.log(a);


// let vehicle= {
//     name:'BMW',
//     color:'black',
//     price:100000,
//     getData:function(){
//     return this.name;
//     return this.color;
//     return this.price;    
// }};
// var aa=vehicle.getData();
// console.log("vehicle name="+aa);
// console.log("vehicle color="+vehicle.color);
// console.log("vehicle price="+vehicle.price);

// for(let i in vehicle){
//     console.log(vehicle[i]);
// }

//***************************************************************************************************** */
// let arr=['shweta','jadhav','namrata','namu','mummy','pappa'];
// console.log(arr);

// let a=arr.indexOf('shweta');
// console.log(a);

// let a1=arr.push('s');
// console.log(arr);

// let a2=arr.pop('s');
// console.log(arr);

// let a3=arr.unshift('s')
// console.log(arr);

// let a4=arr.shift('s');
// console.log(arr);

// let a5=arr.includes('jadhav',0)
// console.log(a5);

// arr.splice(3,0,'s');
// console.log(arr);

// let a7=arr.join('=');
// console.log(a7);

// let num=[1,2,3,4];
// let newnum=num.map((value,index)=>{
// value=value+10;
// return value;
// });
// console.log(newnum);

// let newnum1=num.filter((value,index)=>{
    
//     return value>2;
// })
// console.log(newnum1);

//***************************************STRING************************************* */

// var str='shweta';
// var a=str.toUpperCase();
// console.log(a);

// var a1=str.toLowerCase();
// console.log(a1);

// var a2=str.concat('jadhav')
// console.log(a2);

// var a3=str.includes('h',0)
// console.log(a3);

// var a4=str.split('e',2);
// console.log(a4);

// var a5=str.substring(0,2);
// console.log(a5);

// var a6=str.trim('');
// console.log(a6);

// var a7=str.replace('a','i');
// console.log(a7);

//***************************************FUNCTION************************************************* */

// function prime(n){
//     for(var i=2;i<=n;i++){
//         if(n%i===0)
//         break;
//     }
//     if(i===n)
//     console.log('prime');
//     else
//     console.log("not prime")
// }prime(3);

// var prime=function(n){
//     for(var i=2;i<=n;i++){
//         if(n%i===0)
//         break;
//     }
//      if(i===n)
//      console.log('prime');
//      else
//      console.log("not prime")
// }
// prime(3);

// (function(n){
//     for(var i=2;i<=n;i++){
//                 if(n%i===0)
//                 break;
//             }
//              if(i===n)
//              console.log('prime');
//              else
//              console.log("not prime")
// })(5);

// var prime=n=>{
//     for(var i=2;i<=n;i++){
//                 if(n%i===0)
//                 break;
//             }
//              if(i===n)
//              console.log('prime');
//              else
//              console.log("not prime")
// }
// prime(3);



//************************************WINDOW************************************* */
function sum(a,b){
    function addsum(){
        return a+b;
    }
    return addsum;
}
var addfun=sum(10,20);
var total=addfun();
console.log(total);
console.log("==================================");
console.log(window);
console.log(this);
console.log(this===window);
var name='shweta';
console.log(window.name);
console.log(this.name);


var shweta={
    name:'abc',
    age:21,
    
    getname:function(){
        console.log(this);
        console.log(window);
        getData();
        function getData(){
            console.log("get data",this.name);
        }
        return this.name;
    }
}
var a=shweta.getname();
console.log(a);












