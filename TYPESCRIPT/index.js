console.log("==================nested namespace======");
var RectOpeartion;
(function (RectOpeartion) {
    var rectangle;
    (function (rectangle) {
        function area(length, width) {
            console.log("area" + length + width);
        }
        rectangle.area = area;
        function perimiter(length, width) {
            console.log("area" + length + width);
        }
        rectangle.perimiter = perimiter;
    })(rectangle = RectOpeartion.rectangle || (RectOpeartion.rectangle = {}));
})(RectOpeartion || (RectOpeartion = {}));
RectOpeartion.rectangle.area(12, 23);
RectOpeartion.rectangle.perimiter(12, 23);
// let myName:string='shweta';
// let company;
// company='ust';
// company=23;
// console.log(company);
// let sample: number|boolean;
// sample=10;
// sample=true;
// console.log(sample);
// let myArray:string[]=['adad','awdfaw','ef'];
// console.log(myArray);
// let myTuple:[string,number,boolean]=['',1,true];
// enum colors{
//     red=300,
//     blue,
//     green,
//     black
// }
// console.log(colors.black);
// enum colors1{
//     red='danger',
//     blue='info',
//     green='success',
//     black='dark'
// }
// console.log(colors1.black);
// console.log("=============class with constructor=================");
// class Person{
//     name:string;
//     age:number;
//     constructor(name1:string,age1:number){
//         this.name=name1;
//         this.age=age1;
//     }
// }
// let person=new Person('shweta',21);
// console.log(person.name);
// console.log(=============easy way to use constructor============);
// class Person{
//     constructor(public name1:string,public age1:number){
//     }
// }
// let person=new Person('shweta',21);
// console.log(person.age1);
// let a='ased';
// a=null;   //    "strictNullChecks": true,              /* Enable strict null checks. */
// console.log(=============static memeber access by class============);
// class Book{
//     name:string='gfh';
//     static price:number=54;
// }
// let bk=new Book();
// console.log(bk.name);
// console.log(Book.price);
// console.log(=============creating object in 2nd way============);
// class Book{
//         constructor(public name:string,public price:number){
//         }
//      }
//      let lib:Book={
//                 name:'dfs',
//                 price:4
//      }
//      console.log(lib.name);
//  console.log("=============inheritance============");
// class Person{
//     constructor(public name:string,public id:number){}
// }
// class Student extends Person{
//     constructor(public myName:string,public myid:number,public age:number){
//         super(myName,myid);
//     }
// }
// let student1=new Student('df',343543,21);
// console.log(student1.myName);
// console.log(student1.myid);
// console.log(student1.age);
// console.log("===================optional variable using ?========================")
// class Person{
//     constructor(public name:string,public age:number,public degree ?:string){}
// }
// let person:Person={
//     name:'sdcs',
//     age:23
// }
// let person2:Person={
//     name:'dfsdf',
//     age:23,
//     degree:'fxbvg'
// }
// console.log("===================Interface========================")
// interface Person{
//     name:string;    //we cannot initialize variable in interface   ex name:string='afaf'; thrwoing error
//     age:number;
//     printDeatils():void;
// }
// class Student implements Person{
//     name='shweta';
//     age=21;
//     printDeatils(){
//         console.log(this.name);
//     }
// }
//  let stud=new Student;
//  stud.printDeatils();
//  let per1:Person={
//      name:'jadhav',
//      age:23,
//      printDeatils:()=>{
//          console.log("name is"+per1.name+"age is"+per1.age);
//      }
//  }
// per1.printDeatils();
// function getArray<p>(items:p[]):p[]{
//     return new Array<p>().concat(items);
// }
// let strArray=getArray<string>(['aedf','aef','fv']);
// strArray.push('asd');
// let numArray=getArray<number>([23,456,325]);
// numArray.push(234);
// console.log(numArray);
// 
/// <reference path="./rectangle.ts" />
RectOpeartion.rectangle.area(12, 23);
//  RectOpeartion.rectangle.perimiter(12,23);
