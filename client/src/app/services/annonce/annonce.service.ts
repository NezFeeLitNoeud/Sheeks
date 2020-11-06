import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AnnonceService {

  constructor(private http: HttpClient) { }

  public getEveryAnnonce(){
    return this.http
      .get(`http://localhost:8080/search/announce`);
  }

  public getAnnonceById(id: number){
    return this.http
      .get(`http://localhost:8080/search/announce/${id}`);
  }
}
