import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class TaskserviceService {

  constructor(private http: HttpClient) { }

  Task:any[]=[];
  postData(data) {
    return this.http.post('http://localhost:4444/task/add',data);
  }

  getData(){
    return this.http.get('http://localhost:4444/task/get-all').subscribe(resData =>{
      console.log(resData);
      this.Task = resData.task;
      console.log(this.Task);
    },err=>{
      console.log(err);
    })
  }
  
  updateData(data) {
    return this.http.put('http://localhost:4444/task/modify',data);
  }

  deleteData(data) {
    return this.http.delete(`http://localhost:4444/task/remove/${data}`);
  }
}
