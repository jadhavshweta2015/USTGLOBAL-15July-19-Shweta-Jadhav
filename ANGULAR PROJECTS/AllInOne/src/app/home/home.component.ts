import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  
img='https://cdn.pixabay.com/photo/2015/03/26/09/54/pug-690566__340.jpg';
name="doggy";
isActive=false;
color="red";
color1='blue'
print(){
  alert("hello");
}

search="abc";
constructor(){
  // setTimeout(()=>{
  //   this.isActive=true;
  // },2000)
  setInterval(()=>{
    this.isActive=!this.isActive;
  },1000)
}
  // name='shweta';
  // background='red';
  // padding='50px';
  // redColor=true;
  // isAplicable=true;
  // textClass='bg-danger text-white';
  // ClassArray=["text-center","bg-primary"]
  // colspan=2;
  // constructor() {
  //   setTimeout(() => {
  //     this.isAplicable=false;
  //     this.redColor=false;
  //   }, 2000);
  // }
  ngOnInit() {
  }

}
