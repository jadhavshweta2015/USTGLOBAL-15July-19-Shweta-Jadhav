var fruits=['apple','banana','mango'];
console.log(fruits[0]);
for(var i=0;i<fruits.length;i++){
    console.log(fruits[i]);
}
var todaydate=new Date();
console.log("todays date="+todaydate);

var todaydate1=new Date(1997,08,14,08,45,23,23);
console.log("todays date="+todaydate1);

var todaydate3=new Date(0); //zero time is january 01,1970 00:00:00
console.log("todays date="+todaydate3);

var todaydate4=new Date("august 14,1997 11:12:00");
console.log("todays date="+todaydate4);

var todaydate5=new Date();
var t=todaydate5.getFullYear();
console.log("todays date="+t);

var todaydate6=new Date();
var t=todaydate5.getMonth();
console.log("todays date="+t);

var todaydate6=new Date();
var t=todaydate5.getDay();
console.log("todays date="+t);

var todaydate6=new Date();
var t=todaydate5.getDate();
console.log("todays date="+t);

var todayDate=new Date();
var months=['jan','feb','mar','apr','may','jun','jul','aug','sep','oct','nov','dec'];
var day=['sun','mon','tue','wed','thu','fri','sat'];
console.log(months[todayDate.getMonth(5)]);
console.log(day[todayDate.getDay(5)]);


var s=Math.min(2,5,6,1);
console.log(s);
console.log(Math.max(2,5,3,9));
console.log(Math.ceil(4.4));
console.log(Math.floor(4.4));
console.log(Math.PI);
console.log(Math.pow(2,3));
console.log(Math.random());

console.log(Math.random()*10+Math.random());

for(var i=10;i<100;i++)
{
    console.log(Math.random()+i);
}

console.log(Math.round(Math.random()*10));


var name="shweta";
console.log(name);
var name1=name;
console.log(name1);

name1="abc";
console.log(name);
console.log(name1);

var person={
    name:"sdc"
};

console.log(person.name);
var person1=person;
console.log(person1.name);
person1.name="anu";
console.log(person.name);
console.log(person1.name);


var person=new Object();
person.name='shweta';
console.log(person.name);
person.age='21';
console.log(person.age);
person.height='5.4';
console.log(person.height);
 var car=new Array('bmw','adc','sda');
 console.log(car);

 console.log("===========================");

 var person=[
     {employee:'a',age:21,height:5.4},
     {employee:'b',age:22,height:5.5},
     {employee:'c',age:23,height:5.6},
     {employee:'d',age:24,height:5.7}

 ];
 
 for(var i=0;i<person.length;i++){
    console.log(person[i]);
 }
 console.log("===========================");

 var person=[
    {employee:'a',age:21,height:5.4},
    {employee:'b',age:22,height:5.5},
    {employee:'c',age:23,height:5.6},
    {employee:'d',age:24,height:5.7}

];

for(var i=0;i<person.length;i++){
   console.log(person[i].employee);
}



console.log("===========================");

//***for in*** (for array and object)

var person=['shweta','sukk','simran'];
for(var index in person)
console.log("person="+person[index]);

var sss={
    name:'shweta',
    age:21
};
for(var index in sss)
{
console.log(sss[index]);
}
console.log("===========================");
//****for of***(array only it gives values of array)
var person=['shweta','sukk','simran'];
for(var value of person)
console.log(value);


// console.log("===========================");
// var num=2;
// if(num===2){
//     break;//not work here bcoz break is only work in loop
//     console.log(num);
// }

console.log("===========================");
person[3]='jabeen';
person['name']='aisha';
for(var index in person)
{
console.log(person[index]);
}
console.log("===========================");
console.log("===========================");

for(var value of person)
{
console.log(value);
}

console.log(person);



console.log("=============function==============");
function getSum(a,b){
    var c=a+b;
    return c;
}
var d=getSum(10,20);
console.log("sum="+d);

console.log("=============2nd way function===function expression===========");
var sumData=function(a,b){
    var c= a+b;
    return c;
}
var sumValue=sumData(10,20);
console.log(sumValue);

console.log("=============3rd way iife==============");
(function(a,b){
    var c=a+b;
    console.log("sum="+c)
}(10,20));


console.log("=============4th way fat arroy function==============");
var getSum=(a,b)=>
{
    var c=a+b;
    console.log("sum"+c);
}
getSum(10,20);


console.log("==========hoisting=================");
console.log(name123);//run gives referenced error
var name123="abc";// gives undefined



console.log("===========================");
var name12;
console.log(name12);
name12="asd";
console.log(name12);

console.log("===========================");
function ame()
{
    var name;
    console.log(name);
    name="ed";
}
ame();


// console.log("===========================");
// function firstfunction(callback){
//     setTimeout(function(){
//     console.log("first");
//     callback();
//     },1000);
// }
// function secondfunction(){
//     console.log("second");
// }
// firstfunction(secondfunction);
// // secondfunction();


console.log("=============factorial of number==============");
function factorial(n){
    var fact=1
    for(var i=1;i<=n;i++)
    fact=fact*i;
   console.log(fact);
}
factorial(5);


console.log("=============fibonacci using fat arrow==============");
var getFibonacci=n=>{
    var t0=0,t1=1,sum=0;
    for(var i=1;i<=n;i++){
        
        sum=t0+t1;
        
        t0=t1;
        t1=sum
        console.log(sum);
    }
    
}
getFibonacci(3);


console.log("=============aRRAY ADD==============");
 var www1=[1,2,10,20];
 var sum=0;
 for(var i=0;i<www1.length;i++){
    sum=sum+www1[i];
 }

     console.log(sum);

 


 console.log("=============circumference using iife============");

(function(r){
    var cir=2*Math.PI*r;
    console.log(cir)
})(2);


console.log("=============prime using function expression==============");
var prime=function(n){
    for(var i=2;i<=n;i++){
        if(n%i===0){
            break;
        }

    }
    if(i===n){
        console.log("prime");

    }
    else
    console.log("not prime");

}
prime(5);

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

console.log("=================add in array without modifying original array creat new array====================");
var n=[10,20,30,40];
var n1=[];
for(var i=0;i<n.length;i++){
    number=n[i]+10;
    n1.push(number);
}
console.log(n1)

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

console.log("=====================exmaple====================");
var store=[
    {
        item:'pen',
        price:50
    },
    {
        item:'bag',
        price:500
    },
    {
        item:'laptop',
        price:50000
    }
];
var newstore=store.map( (value,index)=>{
    return value.price+10;
});
console.log(newstore);

console.log("=========================================");
var nnnn=store.filter((value,index)=>{
    return value.price>200;
});
console.log(nnnn);
console.log("=========================================");
var nnnn=store.filter((value,index)=>{
    return value.price>100 && value.item.length>2;
        
    });

console.log(nnnn);




console.log("===================String method======================");
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

console.log("=========================================");
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






console.log("=================Recursion==================");
function fact(n){
    if(n===0||n===1){
        return 1;
    }
    else{
 return n*fact(n-1);
    } 
}
let rrr=fact(5);
console.log(rrr);