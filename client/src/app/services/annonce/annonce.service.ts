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

  public postAnnounce(pseudo_id: number, annonce_id: number, title: string, message: string, jeux: string, plateforme: string, niveau: string){
    return this.http
    .post('http://localhost:8080/search/post', {
  pseudo_id: pseudo_id,
  annonce_id: annonce_id,
  title: title,
  message: message,
  jeux: jeux,
  plateforme: plateforme,
  niveau: niveau
  })
}

public getAnswerFromAnnounce(id: number){
return this.http
.get(`http://localhost:8080/search/announce/${id}/answer`);
}

public answer(pseudo_id: number, annonce_id: number, message: string){
  return this.http
  .post('http://localhost:8080/search/answer', {
pseudo_id: pseudo_id,
annonce_id: annonce_id,
message: message,

})
}
}
