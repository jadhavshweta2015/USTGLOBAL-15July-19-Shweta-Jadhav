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