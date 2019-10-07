import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-student-display',
  templateUrl: './student-display.component.html',
  styleUrls: ['./student-display.component.css']
})
export class StudentDisplayComponent implements OnInit {

  constructor(private firebaseservice:FirebaseService,private router:Router) { }
  deleteUser(stud){
    this.firebaseservice.deleteData(stud).subscribe(data=>{
      console.log(data);
      this.firebaseservice.getData();
    }),err=>{
      console.log(err);
    }
  }
  updateUser(stud){
    this.firebaseservice.selectedUser=stud;
    this.router.navigateByUrl('/entry')
  }
  ngOnInit() {
    this.firebaseservice.getData();
  }

}
