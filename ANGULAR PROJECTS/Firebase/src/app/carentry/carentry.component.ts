import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-carentry',
  templateUrl: './carentry.component.html',
  styleUrls: ['./carentry.component.css']
})
export class CarentryComponent implements OnInit {
 

  constructor(private firebaseService:FirebaseService,private router:Router) { }

  

  // postUser(userForm: NgForm){
    
  //   this.firebaseService.postData(userForm.value).subscribe(resData=>{
  //     console.log(resData);
  //     this.firebaseService.getData();
  //     this.router.navigateByUrl('/display')

  //     userForm.reset();
  //   },err=>{
  //     console.log(err);
  //   })
  // }


  postUser(userForm: NgForm){
    if(userForm.value.id){
this.firebaseService.updateData(userForm.value).subscribe((data)=>{
  console.log(data);
  this.firebaseService.getData();
  userForm.reset();
  this.router.navigateByUrl('/display')
},err=>{
  console.log(err);
})
    }else{
    this.firebaseService.postData(userForm.value).subscribe(resData=>{
      console.log(resData);
      this.firebaseService.getData();
      this.router.navigateByUrl('/display')

      userForm.reset();
    },err=>{
      console.log(err);
    })
  }
}

  ngOnInit() {
  }

}
