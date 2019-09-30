// let resultData=new Promise(function(resolve,reject){
// if(10===10){
// reject('failed');
// }
// else{
//     resolve('success');
// }
// });
// resultData.then((data)=>{
//     console.log('then block='+data);
// }).catch((error)=>{
//     console.log('catch block='+error);
// })



let employeetData=new Promise(function(resolve,reject){
    const employee=[
        {
            name:'shweta',
            age:21
        },
        {
            name:'sukanya',
            age:22
        },
        {
            name:'abc',
            age:22
        }
    ];
    if(9<10){
        resolve(employee);
    //reject('failed');
    }
    else{
        reject('failed');
        //resolve(employee);

        
    }
    });
    employeetData.then((data)=>{
       console.log('employee block=',data);
        return data;
    }).catch((error)=>{
        console.log('catch block=',error);
    });
    // //.then(function(data1){
    //     console.log('this is then block 2',data1);
    // });