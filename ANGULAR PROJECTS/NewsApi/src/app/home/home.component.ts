import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  sports:any[]=[];
  technology:any[]=[];
  entertainment:any[]=[];
  constructor(private https:HttpClient) { 
    https.get<any>('https://newsapi.org/v2/top-headlines?category=sport&apiKey=3ca92f8a3115451688f72db5df977eba').subscribe(resData=>{
    this.sports=resData.articles;
      console.log(this.sports);   
    })
    https.get<any>('https://newsapi.org/v2/top-headlines?category=technology&apiKey=3ca92f8a3115451688f72db5df977eba').subscribe(resData=>{
      this.technology=resData.articles;
      console.log(this.technology);
    })
    https.get<any>('https://newsapi.org/v2/top-headlines?category=entertainment&apiKey=3ca92f8a3115451688f72db5df977eba').subscribe(resData=>{
      this.entertainment=resData.articles;
      console.log(this.entertainment);
    })
  
  }

  ngOnInit() {
  }

}
