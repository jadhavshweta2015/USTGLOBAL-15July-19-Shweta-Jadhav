import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators'
import { Student } from './student-entry/Student';
@Injectable({
  providedIn: 'root'
})
export class FirebaseService {
selectedUser:Student={
id:null,
name:null,
age:null
}
  constructor(private http:HttpClient) { }
  url:any='https://practise-50993.firebaseio.com/';
  postData(data){
    return this.http.post(`${this.url}/student.json`,data);
  }
Student:any=[];
getData(){
  return this.http.get(`${this.url}/student.json`).pipe(map(data=>{
    let userArray=[];
    for(let key in data) {
    userArray.push({...data[key],id:key});
    }
    return userArray;
  })).subscribe(data=>{
    this.Student=data;
    console.log(data);
  },err=>{
    console.log(err);
  })
  }

  deleteData(data){
    return this.http.delete(`${this.url}/student/${data.id}.json`,data);
  }

  updataData(data){
    return this.http.put(`${this.url}student/${data.id}.json`,data);
  }
  ngDoCheck(){
    this.getData();
  }
}
