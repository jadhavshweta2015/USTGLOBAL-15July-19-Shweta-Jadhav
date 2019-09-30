function printConstructor(con: Function) {
    console.log(con);
}

@printConstructor   //to use decorator
class Sample{
    constructor(){
    console.log('aesfaef');
}
}