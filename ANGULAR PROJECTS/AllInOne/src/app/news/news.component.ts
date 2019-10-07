import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  News:any=[];

  constructor(public http:HttpClient) { 
    http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=3ca92f8a3115451688f72db5df977eba').subscribe(resdata=>{
      this.News=resdata.articles;
      console.log(this.News);
    })
  }

  

  ngOnInit() {
  }

}
