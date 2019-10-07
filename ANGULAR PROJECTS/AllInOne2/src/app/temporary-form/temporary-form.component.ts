import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-temporary-form',
  templateUrl: './temporary-form.component.html',
  styleUrls: ['./temporary-form.component.css']
})
export class TemporaryFormComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  Student:any=[];
print(login){
  console.log(this.Student);
  this.Student.push(login.value);
  login.reset();
}

delete(stud){
  var index=this.Student.indexOf(stud);
 this.Student.splice(index,1);
}
}
