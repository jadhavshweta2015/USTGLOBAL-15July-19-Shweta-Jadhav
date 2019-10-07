import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { Customvalidator } from './custom.validator';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {

  constructor() { }
get name(){
  return this.register.get('name');
}

get email(){
  return this.register.get('email');
}
get uname(){
  return this.register.get('uname');
}
get password(){
  return this.register.get('password');
}
  register=new FormGroup({
                            name:new FormControl('',[Validators.required]),
                            email:new FormControl('',[Validators.email,
                                                      Customvalidator.nospace,
                                                    ]),
                            uname:new FormControl('',[Validators.required]),
                            password:new FormControl('',[Validators.required])
  })
  ngOnInit() {
  }
print(register){
  console.log(register.value);
  register.reset();
}
}
