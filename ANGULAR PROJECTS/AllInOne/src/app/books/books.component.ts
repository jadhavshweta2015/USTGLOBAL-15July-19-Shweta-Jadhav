import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {

  constructor(private firebaseService:FirebaseService,private router:Router) { }

  
  postUser(Form: NgForm){
    if(Form.value.id){
this.firebaseService.updateData(Form.value).subscribe((data)=>{
  console.log(data);
  this.firebaseService.getData();
  Form.reset();
  this.router.navigateByUrl('/details')
},err=>{
  console.log(err);
})
    }else{
    this.firebaseService.postData(Form.value).subscribe(resData=>{
      console.log(resData);
      this.firebaseService.getData();
      this.router.navigateByUrl('/details')

      Form.reset();
    },err=>{
      console.log(err);
    })
  }
}
  ngOnInit() {
  }

}
