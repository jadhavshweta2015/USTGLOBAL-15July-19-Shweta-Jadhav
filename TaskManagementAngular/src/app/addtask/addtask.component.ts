import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addtask',
  templateUrl: './addtask.component.html',
  styleUrls: ['./addtask.component.css']
})
export class AddtaskComponent implements OnInit {

  constructor(private firebase:FirebaseService,private router:Router) { }
postTask(register:NgForm){
  if(register.value.id){
      this.firebase.updateData(register.value).subscribe(data=>{
        console.log(data);
        this.firebase.getData();
        this.router.navigateByUrl('/view');
        register.reset();
      },err=>{
        console.log(err);
      })
  }else{
  this.firebase.postData(register.value).subscribe(data=>{
          console.log(data);
          this.router.navigateByUrl('/view');
          register.reset();
        },err=>{
          console.log(err)
        })
      }
}
  ngOnInit() {
  }

}
