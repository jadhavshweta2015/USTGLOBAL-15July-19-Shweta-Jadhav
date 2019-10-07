import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cardisplay',
  templateUrl: './cardisplay.component.html',
  styleUrls: ['./cardisplay.component.css']
})
export class CardisplayComponent implements OnInit {

  constructor(private firebaseService: FirebaseService, private router: Router) { }

  updateUser(car){
    this.firebaseService.selectedUser=car;
    this.router.navigateByUrl('/entry');

  }

  deleteUser(car){
    this.firebaseService.deleteData(car).subscribe(resData=>{
      console.log(resData);
      this.firebaseService.getData();
    },err=>{
      console.log(err);
    })
  }


  ngOnInit() {
    this.firebaseService.getData();
  }

}
