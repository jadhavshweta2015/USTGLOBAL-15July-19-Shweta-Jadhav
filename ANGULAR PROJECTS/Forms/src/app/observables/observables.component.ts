import { Component, OnInit, OnDestroy } from '@angular/core';
import { interval, Subscription } from 'rxjs';
import { UserService } from '../user.service';
// import { map } from "rxjs/operators";

@Component({
  selector: 'app-observables',
  templateUrl: './observables.component.html',
  styleUrls: ['./observables.component.css']
})
export class ObservablesComponent implements OnInit,OnDestroy {
  mySubscription: Subscription;
  constructor(private userService:UserService) { }

  ngOnInit() {
    // this.mySubscription=interval(1000).pipe(map(data=>{
    //   return data*10;
    // })).subscribe(data=>{
    //   console.log(data);
    // },err=>{
    //   console.log(err);
    // },()=>{
    //   console.log('complete');
    // });
    this.userService.printDetails();
  }
  ngOnDestroy(){
    // this.mySubscription.unsubscribe();
  }

}
