import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {  map} from 'rxjs/operators'
import { Books } from './books-details/Book';
@Injectable({
  providedIn: 'root'
})
export class FirebaseService  {
selectedUser:Books={
  id:null,
  name:null,
  author:null,
  number:null
  
}
  constructor(private http:HttpClient) {}
  url:String='https://practise-50993.firebaseio.com/';

  postData(data){
    return this.http.post(`${this.url}/book.json`,data);
  }


  Books=[];
  getData(){
    return this.http.get(`${this.url}/book.json`).pipe(map(data=>{
      let userArray=[];
      for(let key in data) {
      userArray.push({...data[key],id:key});
      }
      return userArray;
    })).subscribe(data=>{
      this.Books=data;
      console.log(data);
    },err=>{
      console.log(err);
    })
  }

  updateData(data){
    return this.http.put(`${this.url}book/${data.id}.json`,data);
  }

  deleteData(data){
    return this.http.delete(`${this.url}book/${data.id}.json`,data);
  }
  ngDoCheck(){
    this.getData();
  }
   

}
