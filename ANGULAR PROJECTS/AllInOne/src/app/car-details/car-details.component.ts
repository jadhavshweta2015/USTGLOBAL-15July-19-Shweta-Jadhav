import { Component, OnInit } from '@angular/core';
import { ShwetaService } from '../shweta.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-car-details',
  templateUrl: './car-details.component.html',
  styleUrls: ['./car-details.component.css']
})
export class CarDetailsComponent implements OnInit {

  constructor(private namu:ShwetaService,private router:Router) { }

  updateUser(car){
    this.namu.selectedUser=car;
    this.router.navigateByUrl('/car');
  }

  deleteUser(car){
    this.namu.deleteData(car).subscribe(data=>{
      console.log(data);
      this.namu.getData();
    },err=>{
      console.log(err);
    })
  }
  
  ngOnInit() {
    this.namu.getData();
  }

}
