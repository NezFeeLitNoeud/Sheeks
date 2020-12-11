import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class JeuxService {

  constructor(private http: HttpClient) { }

  public getAllGame(){
    return this.http
    .get('http://localhost:8080/game');
  }
}
