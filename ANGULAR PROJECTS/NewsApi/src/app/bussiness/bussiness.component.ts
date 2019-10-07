import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-bussiness',
  templateUrl: './bussiness.component.html',
  styleUrls: ['./bussiness.component.css']
})
export class BussinessComponent implements OnInit {
bussiness:any[]=[];
  constructor(private https:HttpClient) { 
    https.get<any>('https://newsapi.org/v2/top-headlines?country=de&category=business&apiKey=3ca92f8a3115451688f72db5df977eba').subscribe(resData=>{
      this.bussiness=resData.articles;
      console.log(this.bussiness);
    })
  }

  ngOnInit() {
  }

}
