import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from './product-details/user';
import {map} from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class FirebaseService {
  selectedUser:Product={
    brand:null,
    image:null,
    
    id:null
  }
  constructor(private http:HttpClient) { }
  url:string='https://product-4297e.firebaseio.com/';

  postData(data){
    return this.http.post(`${this.url}/car.json`,data);
  }

  products:any=[];
  getData(){
    return this.http.get(`${this.url}/car.json`).pipe(map(resData=>{
      let usersArray=[];
      for(let key in resData){
        usersArray.push({...resData[key],id:key});
      }
      return usersArray;
    })).subscribe(data=>{
      this.products=data;
      console.log(data);
    },err=>{
      console.log(err);
    });
  }

  updateData(data){
    return this.http.put(`${this.url}car/${data.id}.json`,data);
  }
  deleteData(data){
    return this.http.delete(`${this.url}car/${data.id}.json`,data);
  
  }

  ngDoCheck(){
    this.getData();
  }
}
