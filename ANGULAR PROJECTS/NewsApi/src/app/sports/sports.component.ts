import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sports',
  templateUrl: './sports.component.html',
  styleUrls: ['./sports.component.css']
})
export class SportsComponent implements OnInit {

  sports:any[]=[];
  constructor(private https:HttpClient) { 
    https.get<any>('https://newsapi.org/v2/top-headlines?category=sport&apiKey=3ca92f8a3115451688f72db5df977eba').subscribe(resData=>{
      this.sports=resData.articles;
      console.log(this.sports);
    })
  }

  ngOnInit() {
  }

}
