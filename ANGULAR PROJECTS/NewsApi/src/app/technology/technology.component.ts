import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-technology',
  templateUrl: './technology.component.html',
  styleUrls: ['./technology.component.css']
})
export class TechnologyComponent implements OnInit {

  technology:any[]=[];
  constructor(private https:HttpClient) { 
    https.get<any>('https://newsapi.org/v2/top-headlines?category=technology&apiKey=3ca92f8a3115451688f72db5df977eba').subscribe(resData=>{
      this.technology=resData.articles;
      console.log(this.technology);
    })
  }


  ngOnInit() {
  }

}
