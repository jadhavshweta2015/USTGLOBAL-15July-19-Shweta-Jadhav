import { Component, OnInit, Input, Output } from '@angular/core';
import { EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  constructor() { }
  @Output() event=new EventEmitter();
  show(url){
    this.event.emit(url);
  }
@Input() dogdetails=''
  ngOnInit() {
  }

}
