import { Component, OnInit, Output, EventEmitter, Input } from '@angular/core';
import { send } from 'q';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  constructor() { }
  @Output() dataFromChild=new EventEmitter();
  
  send(url){
    this.dataFromChild.emit(url)
  }
  ngOnInit() {
    //this.dataFromChild.emit('https://cdn.pixabay.com/photo/2015/03/26/09/54/pug-690566__340.jpg')
  
  }

}
