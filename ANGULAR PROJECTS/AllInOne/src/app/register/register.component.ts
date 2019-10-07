import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { Customvalidator } from './custom.validator';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  get name(){
    return this.registerForm.get('name');
  }
  get address(){
    return this.registerForm.get('address')
  }
  get email(){
    return this.registerForm.get('email');
  }
  get number(){
    return this.registerForm.get('number');
  }
  get username(){
    return this.registerForm.get('username');
  }
get password(){
  return this.registerForm.get('password');
}

  constructor() { }
  registerForm=new FormGroup({
                                name:new FormControl('',[Validators.minLength(5),
                                                        Validators.required]),
                                address:new FormControl('',[Validators.required]),
                                email:new FormControl('',[Validators.email,
                                                            Validators.required,
                                                          Customvalidator.noSpace]),
                                number:new FormControl('',[Validators.minLength(10)]),
                                username:new FormControl('',[Validators.required]),
                                password:new FormControl('',[Validators.minLength(5),
                                                              Validators.required])


  });
  printForm(registerForm){
    console.log(registerForm.value);
    registerForm.reset();
  }
  ngOnInit() {
  }

}
