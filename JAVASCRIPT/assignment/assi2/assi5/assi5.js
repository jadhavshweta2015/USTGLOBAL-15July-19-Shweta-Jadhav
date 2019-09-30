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