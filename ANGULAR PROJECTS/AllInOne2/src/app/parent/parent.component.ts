import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  dogs:any='';
  constructor() { }
show(dogs){
  this.dogs=dogs;
}
  Dogs:any=[
    {
      image:'https://cdn.pixabay.com/photo/2015/03/26/09/54/pug-690566__340.jpg',
      breed:'Pug'
    },
    {
      image:'https://cdn.pixabay.com/photo/2018/03/31/06/31/dog-3277416__340.jpg',
      breed:'Doberman'
    },
    {
      image:'https://cdn.pixabay.com/photo/2018/05/07/10/48/husky-3380548__340.jpg',
      breed:'Husky'
    },
    {
      image:'https://cdn.pixabay.com/photo/2017/09/25/13/12/dog-2785074__340.jpg',
      breed:'Cute'
    }
  ];

  ngOnInit() {
  }

}
