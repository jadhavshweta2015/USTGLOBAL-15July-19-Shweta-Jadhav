import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {
  carData:any='';
  constructor() { }
  Cars=[
    {
      brand:'BMW',
      img:'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      description:'BMW (German pronunciation: [ˈbeːˈʔɛmˈveː] ( listen)) is a German multinational company which produces automobiles and motorcycles. The company was founded in 1916 as a manufacturer of aircraft engines, which it produced from 1917 until 1918 and again from 1933 to 1945.'
    },
    {
      brand:'AUDI',
      img:'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
      description:'Audi AG (German: [ˈaʊ̯di ʔaːˈɡeː] ( listen)) is a German automobile manufacturer that designs, engineers, produces, markets and distributes luxury vehicles. Audi is a member of the Volkswagen Group and has its roots at Ingolstadt, Bavaria, Germany.'
    },
    {
      brand:'MERCEDES',
      img:'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg',
      description:'Mercedes-Benz is a German global automobile marque and a division of Daimler AG. The brand is known for luxury vehicles, buses, coaches, and trucks. The headquarters is in Stuttgart, Baden-Württemberg. The name first appeared in 1926 under Daimler-Benz.'
    },
    {
      brand:'MARUTI',
      img:'https://cdn.pixabay.com/photo/2017/10/09/02/05/car-2832238__340.jpg',
      description:'Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.'
    },
    {
      brand:'MARUTI',
      img:'https://cdn.pixabay.com/photo/2017/10/09/02/05/car-2832238__340.jpg',
      description:'Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.'
    }
    
  ];
  sendCar(cars){
    this.carData=cars;
  }
  ngOnInit() {
  }

}
