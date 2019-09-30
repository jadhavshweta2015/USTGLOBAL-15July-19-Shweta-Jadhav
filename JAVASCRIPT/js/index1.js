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

// console.log("==================================");

// // for(var i=0;i<5;i++){
// //     console.log(i);
// // }
// // console.log("value of i=",i);
// console.log("================let==================");
// // for(let i=0;i<5;i++){
// //     console.log(i);
// // }
// // console.log("value of i=",i);



// console.log("==================================");
// var hobbies=['singing','dancing','cricket'];
// console.log(hobbies);
// var hobbies=['riding'];   //redeclaration
// console.log(hobbies);


// console.log("==================================");

// let fruits=['apple','chiku','mango'];
// console.log(fruits);
// //var fruits=['jackfruit'];   //redeclaration not possible
// fruits=['jackfruit'];         //reinitialization
// console.log(fruits);


// console.log("==================================");
// const a1=['b','c','t'];
// console.log(a1);
// //const a=['riding'];   //redeclaration not possible
// //a=['riding'];           //reinitialization not possible
// a1[0]=['r','h'];
// console.log(a1);

// console.log("==================================");
