import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }
  users=[];
  ngOnInit() {
  }
  printForm(loginForm: NgForm){
    console.log(this.users);
    this.users.push(loginForm.value);
    loginForm.reset();
  }

}
