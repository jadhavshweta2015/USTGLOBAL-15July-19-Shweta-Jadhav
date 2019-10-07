import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
@Output() event=new EventEmitter;
  constructor(private firebaseService:FirebaseService,private router:Router) { }


  postProduct(userForm: NgForm){
    if(userForm.value.id){
  this.firebaseService.updateData(userForm.value).subscribe((data)=>{
  console.log(data);
  this.firebaseService.getData();
  userForm.reset();
  this.router.navigateByUrl('/addproduct')
},err=>{
  console.log(err);
})
    }else{
    this.firebaseService.postData(userForm.value).subscribe(resData=>{
      console.log(resData);
      this.firebaseService.getData();
      this.router.navigateByUrl('/productdetails')

      userForm.reset();
    },err=>{
      console.log(err);
    })
  }
}


  
  ngOnInit() {
  }

}
