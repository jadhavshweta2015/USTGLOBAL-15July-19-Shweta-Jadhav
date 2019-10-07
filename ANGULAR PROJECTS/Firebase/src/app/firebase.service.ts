import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';
import { Car } from './cardisplay/car';

@Injectable({
  providedIn: 'root'
})
export class FirebaseService {

url:string='https://carproject-502fc.firebaseio.com/';

constructor(private http:HttpClient) { }

selectedUser:Car={
  brand:null,
  model:null,
  release:null,
  cost:null,
  unit:null,
  id:null
}

cars:any=[];
  getData(){
    return this.http.get(`${this.url}/carentry.json`).pipe(map(resData=>{
      let usersArray=[];
      for(let key in resData){
        usersArray.push({...resData[key],id:key});
      }
      return usersArray;
    })).subscribe(data=>{
      this.cars=data;
      console.log(data);
    },err=>{
      console.log(err);
    });
  }
postData(data){
  return this.http.post(`${this.url}/carentry.json`,data);
}

updateData(data){
  return this.http.put(`${this.url}carentry/${data.id}.json`,data);
}

deleteData(data){
  return this.http.delete(`${this.url}carentry/${data.id}.json`,data);

}

ngDoCheck(){
  this.getData();
}
}
