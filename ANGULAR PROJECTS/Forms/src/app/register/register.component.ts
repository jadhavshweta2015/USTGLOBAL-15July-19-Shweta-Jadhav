import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidator } from './custom.validator';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  get name(){
    return this.registerForm.get('name');
  }
  get address(){
    return this.registerForm.get('address');
  }
  get email(){
    return this.registerForm.get('email');
  }
  get mblno(){
    return this.registerForm.get('mblno');
  }
  get username(){
    return this.registerForm.get('username');
  }
  get password(){
    return this.registerForm.get('password');
  }
  registerForm= new FormGroup({
                                name:new FormControl('',[Validators.minLength(5),
                                                          Validators.required]),
                                address:new FormControl('',[Validators.required]),
                                email:new FormControl('',[Validators.email,
                                                          Validators.required,
                                                        CustomValidator.noSpace]),
                                mblno:new FormControl('',[Validators.minLength(10),
                                                          Validators.required]),
                                username:new FormControl('',[Validators.minLength(5),
                                                          Validators.required]),
                                password:new FormControl('',[Validators.minLength(5),
                                                            Validators.required])
  });
  printForm(registerForm){
    console.log(registerForm.value);
    registerForm.reset();
  }


}
