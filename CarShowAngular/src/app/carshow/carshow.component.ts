import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-carshow',
  templateUrl: './carshow.component.html',
  styleUrls: ['./carshow.component.css']
})
export class CarshowComponent implements OnInit {

  constructor() { }
  carsdata:any="";
  sendPic(car){
    this.carsdata=car;
  }

  Cars=[
    {
      img:'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      brand:"Mercedes",
      description:"Mercedes-Benz is a German global automobile marque and a division of Daimler AG. The brand is known for luxury vehicles, buses, coaches, and trucks. The headquarters is in Stuttgart, Baden-Württemberg. The name first appeared in 1926 under Daimler-Benz"
    },
    {
      img:'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
      brand:"audi",
      description:"Audi AG is a German automobile manufacturer that designs, engineers, produces, markets and distributes luxury vehicles. Audi is a member of the Volkswagen Group and has its roots at Ingolstadt, Bavaria, Germany. Audi-branded vehicles are produced in nine production facilities worldwide."
    },
    {
      img:'https://cdn.pixabay.com/photo/2017/10/09/02/05/car-2832238__340.jpg',
      brand:"Maruti",
      description:"Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market. "
    },
    {
      img:'https://cdn.pixabay.com/photo/2017/01/06/05/28/car-1957037__340.jpg',
      brand:"Farari",
      description:"Ferrari is an Italian luxury sports car manufacturer based in Maranello. Founded by Enzo Ferrari in 1939 out of Alfa Romeo's race division as Auto Avio Costruzioni, the company built its first car in 1940. "
    }
  ];
  ngOnInit() {
  }

}
