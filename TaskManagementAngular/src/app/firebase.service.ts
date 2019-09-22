import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators'
import { Task } from './viewalltask/Task';
@Injectable({
  providedIn: 'root'
})
export class FirebaseService {
  selected:Task={
    id:null,
    name:null
  }
  url:String='https://angular-project-cc587.firebaseio.com/';

  constructor(private http:HttpClient) { }
  postData(data){
    return this.http.post(`${this.url}/Task.json`,data);
  }

  Task:any=[];
  getData(){
    return this.http.get(`${this.url}/Task.json`).pipe(map(data=>{
      let userArray=[];
      for(let key in data) {
      userArray.push({...data[key],id:key});
      }
      return userArray;
    })).subscribe(data=>{
      this.Task=data;
      console.log(data);
    },err=>{
      console.log(err);
    })
  }

  updateData(data){
    return this.http.put(`${this.url}Task/${data.id}.json`,data);
  }

  deleteData(data){
    return this.http.delete(`${this.url}Task/${data.id}.json`,data);
  }
}
