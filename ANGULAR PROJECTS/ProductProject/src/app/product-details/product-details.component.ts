import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {

  constructor(private firebaseService:FirebaseService,private router: Router) { }

  ngOnInit() {
    this.firebaseService.getData();
  }

  updateUser(product){
    this.firebaseService.selectedUser=product;
    this.router.navigateByUrl('/addproduct');

  }

  deleteUser(product){
    this.firebaseService.deleteData(product).subscribe(resData=>{
      console.log(resData);
      this.firebaseService.getData();
    },err=>{
      console.log(err);
    })
  }
}
