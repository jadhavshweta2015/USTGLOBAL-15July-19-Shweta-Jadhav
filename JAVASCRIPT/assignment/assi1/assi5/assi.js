let hobbies=['dancing','singing','cricket'];
for(let i=0;i<hobbies.length;i++){
console.log(hobbies[i]);
}

let fruits=['apple','mango','chiku','banana'];

fruits.forEach(function(value,index){
    console.log('fruits='+value);
});


let name=['A','B','C','D'];
for(var value of name)
console.log(value);

let laptop=['HP','mac','lenovo','toshiba'];
for(var index in laptop)
{
console.log(laptop[index]);
}

let pen=['cello','bollpen','parker','poilet'];

for(let i=0;i<pen.length;i++){
    console.log(pen[i]);    }
