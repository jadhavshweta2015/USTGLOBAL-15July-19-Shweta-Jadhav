import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { FormsModule,NgForm } from '@angular/forms';
import {NgModule} from '@angular/core';
import { isNgContainer } from '@angular/compiler';
import { Router } from '@angular/router';

@Component({
  selector: 'app-student-entry',
  templateUrl: './student-entry.component.html',
  styleUrls: ['./student-entry.component.css']
})
export class StudentEntryComponent implements OnInit {

  constructor(private firebaseservice:FirebaseService,private router:Router) { }
  
 postUser(login:NgForm){
   if(login.value.id){
    this.firebaseservice.updataData(login.value).subscribe(data=>{
      console.log(data);
      this.firebaseservice.getData();
      this.router.navigateByUrl('/display')
      login.reset();
    },err=>{
      console.log(err);
    })
   }
   else{
  this.firebaseservice.postData(login.value).subscribe(data=>{
    console.log(data);
    this.firebaseservice.getData();
    this.router.navigateByUrl('/display')

    login.reset();
  },err=>{
    console.log(err);
  })
}
 }
  ngOnInit() {
  }

}
