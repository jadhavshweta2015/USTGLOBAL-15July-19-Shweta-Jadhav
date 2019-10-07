import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-health',
  templateUrl: './health.component.html',
  styleUrls: ['./health.component.css']
})
export class HealthComponent implements OnInit {

  health:any[]=[];
  constructor(private https:HttpClient) { 
    https.get<any>('https://newsapi.org/v2/top-headlines?category=health&apiKey=3ca92f8a3115451688f72db5df977eba').subscribe(resData=>{
      this.health=resData.articles;
      console.log(this.health);
    })
  }

  ngOnInit() {
  }

}
