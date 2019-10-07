import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-books-details',
  templateUrl: './books-details.component.html',
  styleUrls: ['./books-details.component.css']
})
export class BooksDetailsComponent implements OnInit {

  constructor(private firebaseService:FirebaseService,private router:Router) { }


  updateUser(book){
    this.firebaseService.selectedUser=book;

    this.router.navigateByUrl('/books')
  }

  deleteUser(book){
    this.firebaseService.deleteData(book).subscribe(data=>{
      console.log(data);
      this.firebaseService.getData();
    },err=>{
      console.log(err);
    })
  }
  ngOnInit() {
   this.firebaseService.getData();
  }

}
