import { Component, OnInit,Input } from '@angular/core';

@Component({
  selector: 'app-dogs-details',
  templateUrl: './dogs-details.component.html',
  styleUrls: ['./dogs-details.component.css']
})
export class DogsDetailsComponent implements OnInit {

  constructor() { }
  @Input() dogdeatils:"";
  ngOnInit() {
  }

}
