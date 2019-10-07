import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-edittask',
  templateUrl: './edittask.component.html',
  styleUrls: ['./edittask.component.css']
})
export class EdittaskComponent implements OnInit {

  constructor(private service : TaskserviceService, private router:Router) { }

  deleteTask(task){
    this.service.deleteData(task).subscribe(data=>{
      console.log(data);
      this.router.navigateByUrl("/show");
    })
  }
  updateTask(task) {
  
    this.service.updateData(task).subscribe(data=>{
      console.log(data);
      this.router.navigateByUrl("/show");
    })
  }

  ngOnInit() {
    this.service.getData();
  }

}
