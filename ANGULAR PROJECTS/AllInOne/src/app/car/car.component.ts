import { Component, OnInit } from '@angular/core';
import {NgModule} from '@angular/core';
import {FormsModule, NgForm} from '@angular/forms'
import { ShwetaService } from '../shweta.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {

  constructor(private namu:ShwetaService,private router:Router) { }
  postUser(userForm: NgForm){
    if(userForm.value.id){
      this.namu.updataData(userForm.value).subscribe(data=>{
        console.log(data);
        this.namu.getData();
        this.router.navigateByUrl('/cardetails');
        userForm.reset();
      },err=>{
        console.log(err);
      })

    }else{
    this.namu.postData(userForm.value).subscribe(data=>{
      console.log(data);
      this.namu.getData();

      this.router.navigateByUrl('/cardetails');
      userForm.reset();
    },err=>{
      console.log(err)
    })
  }
}
  ngOnInit() {
  }

}
