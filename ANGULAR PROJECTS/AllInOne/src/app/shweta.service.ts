import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Cars } from './car-details/Cars';

@Injectable({
  providedIn: 'root'
})
export class ShwetaService {


  constructor(private http:HttpClient) {  }

  selectedUser:Cars={
    id:null,
    name:null,
    prise:null

  }
  url:String='https://practise-50993.firebaseio.com/';

  postData(data){
    return this.http.post(`${this.url}/car.json`,data);
  }

  Cars=[];
  getData(){
    return this.http.get(`${this.url}/car.json`).pipe(map(data=>{
      let userArray=[];
      for(let key in data){
        userArray.push({...data[key],id:key})
      }
      return userArray;

    })).subscribe(resData=>{
      this.Cars=resData;
      console.log(resData);
    },err=>{
      console.log(err);
    })
  }
  updataData(data){
    return this.http.put(`${this.url}car/${data.id}.json`,data);
  }

  deleteData(data){
    return this.http.delete(`${this.url}car/${data.id}.json`,data);
  }
}
