import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news-api',
  templateUrl: './news-api.component.html',
  styleUrls: ['./news-api.component.css']
})
export class NewsApiComponent implements OnInit {
News:any=[];
  constructor(private http:HttpClient) { 
    http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=3ca92f8a3115451688f72db5df977eba').subscribe(resData=>{
      this.News=resData.articles;
      console.log(this.News);
    })
  }

  ngOnInit() {
  }

}
