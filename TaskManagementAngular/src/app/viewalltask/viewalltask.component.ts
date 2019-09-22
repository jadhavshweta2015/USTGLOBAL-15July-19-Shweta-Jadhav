import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-viewalltask',
  templateUrl: './viewalltask.component.html',
  styleUrls: ['./viewalltask.component.css']
})
export class ViewalltaskComponent implements OnInit {

  constructor(private firebase:FirebaseService,private router:Router) { }

  updateTask(task){
    this.firebase.selected=task;
    this.router.navigateByUrl('/task');
  }
  deleteTask(task){
    this.firebase.deleteData(task).subscribe(data=>{
      console.log(data);
      this.firebase.getData();
    },err=>{
      console.log(err);
    })
  }
  ngOnInit() {
    this.firebase.getData();
  }

}
