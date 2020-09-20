import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AnnonceService {

  constructor(private http: HttpClient) { }

  public getAnnonce(){
    return this.http
      .get(`http://localhost:8080/announce`);
  }
}
