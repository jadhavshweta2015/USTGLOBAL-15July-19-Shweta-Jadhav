var num1=10;
 var num2='10';
 if(num1===num2)//javascrpt use === (assignment opeartor) compulsory so that it can use data type
 {
     console.log("equal");
 }
 else{
    console.log("notequal");
 }

 var num1=10;
 var num2='10';
 if(num1==num2)
 {
     console.log("equal");
 }
 else{
    console.log("notequal");
 }

 var num1=10;
 var num2=20;
 var s=(num1===num2)? 'true':'false';//conditional(ternary) operator
 console.log(s);


 var s=(num1>10)?'greater':(num1===10)?'equal':'lesser';//ternary operator in ifelse pattern
 console.log(s);

 var s=10;
console.log("type of s=" +typeof s);
var s='saf';
console.log("type of s=" +typeof s);
var s=['dw','efe','efw','ef'];
//console.log("type of s=" +typeof s);
var sa=Array.isArray(s);
console.log(sa);