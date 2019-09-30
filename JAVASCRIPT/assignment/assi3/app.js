console.log("===================String method ex1 ex======================");
var str='shweta';
var x=str.toUpperCase();
console.log(x);
var x=str.charAt(1);
console.log(x);
var x=str.indexOf('w',0);
console.log(x);
var x=str.concat('jadhav');
console.log(x);
var x=str.includes('e',1);
console.log(x);
var x=str.replace('a','i');
console.log(x);

var x=str.split('e',3);
console.log(x);

var x=str.substr(3,3);
console.log(x);
var x=str.search('e');
console.log(x);
var x=str.trim();
console.log(x);

console.log("===================String method ex2======================");

var str='namrata';
var x=str.toUpperCase();
console.log(x);
var x=str.charAt(3);
console.log(x);
var x=str.indexOf('m',0);
console.log(x);
var x=str.concat('jadhav');
console.log(x);
var x=str.includes('t',1);
console.log(x);
var x=str.replace('a','i');
console.log(x);

var x=str.split('a',3);
console.log(x);

var x=str.substr(3,3);
console.log(x);
var x=str.search('r');
console.log(x);
var x=str.trim();
console.log(x);


console.log("================Array ex 1=========================");


console.log("=============for each==============");
var hobbies=['singing','dancing','coding'];
hobbies.forEach(function(value,index){
    console.log('hobies='+value);
});

console.log("=============for each using fat arrow==============");
var hobbies=['singing','dancing','coding'];
hobbies.forEach( (value,index)=>{
    console.log('hobies='+value);
});



console.log("=============push==============");
hobbies.push('write','travlling')
hobbies.forEach( (value,index)=>{
    console.log('hobies='+value);
});

console.log("=============pop==============");
hobbies.pop()
hobbies.forEach( (value,index)=>{
    console.log('hobies='+value);
});

console.log("=============unshift=============");
hobbies.unshift('travlling')
hobbies.forEach( (value,index)=>{
    console.log('hobies='+value);
});

console.log("=============shift=============");
hobbies.shift()
hobbies.forEach( (value,index)=>{
    console.log('hobies='+value);
});


console.log("=============include=============");
console.log(hobbies.includes('write',2));


console.log("=============splice=============");
hobbies.splice(2,0,'sleeping','walking');
console.log(hobbies);

hobbies.splice(2,1);
console.log(hobbies);

console.log(Array.isArray(hobbies));


console.log("==================slice===================");
var arrr=hobbies.slice(0,2);
console.log(arrr);


console.log("=================indexof====================");
var ww=hobbies.indexOf('walking');
console.log(ww);


console.log("================join=====================");
var q=hobbies.join('=');
console.log(q);


console.log("================ using Map function with fat array===================");
var num=[10,20,30,40];
var newnum=num.map((value,index)=>{
    value=value+10;
    return value;
});

console.log("old num"+num);
console.log("new num"+newnum);


console.log("================filter using fat array=====================");
var n2=num.filter((value,index)=>{
    return value>30;
});
console.log(n2);


console.log("================Array ex 2=========================");
console.log("=============for each==============");
var shweta=['b','c','d'];
shweta.forEach(function(value,index){
    console.log('shweta='+value);
});

shweta.push('e');
console.log(shweta);
shweta.pop('e');
console.log(shweta);
shweta.unshift('e');
console.log(shweta);
shweta.shift('e');
console.log(shweta);

console.log(shweta.includes('d',1));


shweta.splice(3,0,'x','z');
console.log(shweta);

shweta.splice(2,1);
console.log(shweta);

console.log(Array.isArray(shweta));


var arrr=shweta.slice(0,2);
console.log(arrr);


var ww=shweta.indexOf('x');
console.log(ww);


var q=shweta.join('=');
console.log(q);

var t=[1,2,3,4];
var t2=t.map(function(value,index){
    return value+1;
})
console.log(t2);
var t=[1,2,3,4];
var t2=t.filter(function(value,index){
    return value>2;
})
console.log(t2);
