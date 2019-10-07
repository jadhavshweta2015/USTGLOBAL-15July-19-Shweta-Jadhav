import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addtask',
  templateUrl: './addtask.component.html',
  styleUrls: ['./addtask.component.css']
})
export class AddtaskComponent implements OnInit {

  constructor(private service:TaskserviceService,private router:Router) { }

  ngOnInit() {
  }
  addDetails(taskForm : NgForm) {
    this.service.postData(taskForm.value).subscribe(data =>{
      console.log(data);
      taskForm.reset();
      this.router.navigateByUrl("/show");
    },err=>{
      console.log(err);
    })
  }

}
