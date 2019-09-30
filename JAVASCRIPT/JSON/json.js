let employeeJSON={
                    name:'shweta',
                    age:21,
                    hobbies:['dancing','singing']
}
console.log(`my name is ${employeeJSON.name}`);
console.log(employeeJSON);  
let a=JSON.stringify(employeeJSON);
console.log(a);
let b=JSON.parse(a);  
console.log(b);
