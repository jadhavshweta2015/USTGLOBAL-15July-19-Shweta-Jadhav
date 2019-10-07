import { Component, OnInit } from '@angular/core';
import {NgModule} from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

Student:any=[];
  printform(loginForm){
    console.log(this.Student);
    this.Student.push(loginForm.value);
    loginForm.reset();
  }

  delete(stud){
   let index=this.Student.indexOf(stud);
   this.Student.splice(index,1);

  }
  ngOnInit() {
  }

}
