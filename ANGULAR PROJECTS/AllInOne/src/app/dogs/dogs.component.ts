import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dogs',
  templateUrl: './dogs.component.html',
  styleUrls: ['./dogs.component.css']
})
export class DogsComponent implements OnInit {

  constructor() { }


  doggy:any="";
  sendPic(dogs){
    this.doggy=dogs;
  }

  Dogs=[
    {
      img:'https://cdn.pixabay.com/photo/2015/03/26/09/54/pug-690566__340.jpg',
      breed:"PUG",
      description:"The pug is a breed of dog with physically distinctive features of a wrinkly, short-muzzled face, and curled tail. The breed has a fine, glossy coat that comes in a variety of colours, most often fawn or black, and a compact square body with well-developed muscles."
    },
    {
      img:'https://cdn.pixabay.com/photo/2018/05/07/10/48/husky-3380548__340.jpg',
      breed:"HUSKY",
      description:"The Siberian Husky is a medium size working dog breed. The breed belongs to the Spitz genetic family. It is recognizable by its thickly furred double coat, erect triangular ears, and distinctive markings, and is smaller than a very similar-looking dog, the Alaskan Malamute."
    },
    {
      img:'https://cdn.pixabay.com/photo/2016/07/15/15/55/dachshund-1519374__340.jpg',
      breed:"dachshund",
      description:"The dachshund, also known as the sausage dog or wiener dog is a short-legged, long-bodied, hound-type dog breed. They may be smooth-haired, wire-haired, or long-haired."
    },
    {
      img:'https://cdn.pixabay.com/photo/2016/02/19/15/46/dog-1210559__340.jpg',
      breed:"LABRADOR",
      description:"The Labrador Retriever, or just Labrador, is a large breed of retriever-gun dog. The Labrador is one of the most popular breeds of dog in Canada, the United Kingdom and the United States. "
    }
  ];
  ngOnInit() {
  }

}
