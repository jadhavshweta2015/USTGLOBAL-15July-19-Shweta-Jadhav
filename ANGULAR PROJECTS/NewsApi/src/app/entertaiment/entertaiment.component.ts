import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-entertaiment',
  templateUrl: './entertaiment.component.html',
  styleUrls: ['./entertaiment.component.css']
})
export class EntertaimentComponent implements OnInit {

  entertainment:any[]=[];
  constructor(private https:HttpClient) { 
    https.get<any>('https://newsapi.org/v2/top-headlines?category=entertainment&apiKey=3ca92f8a3115451688f72db5df977eba').subscribe(resData=>{
      this.entertainment=resData.articles;
      console.log(this.entertainment);
    })
  }

  ngOnInit() {
  }

}
