import { UserService } from 'src/app/services/users/user.service';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Injectable} from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class AnnonceService {

  constructor(private http: HttpClient, private userService: UserService) {}


  public getEveryAnnonce() {
    return this.http
      .get(`http://localhost:8080/search/announce`);
  }

  public getAnnonceById(id: number) {
    return this.http
      .get(`http://localhost:8080/search/announce/${id}`);
  }

  public postAnnounce(title: string, message: string, niveau: string, plateforme: string, jeux: string) {
    return this.http
      .post('http://localhost:8080/api/search/post', {
        titre: title,
        message: message,
        niveau: niveau,
        plateforme: plateforme,
        jeux: jeux
      }, this.userService.getAuthenticatedHttpOptions())
  }

  public getAnswerFromAnnounce(id: number) {
    return this.http
      .get(`http://localhost:8080/search/announce/${id}/answer`);
  }

  public answer(message: string, annonce_id: number) {
    return this.http
      .post('http://localhost:8080/api/search/answer', {
        message: message,
        announce_id: annonce_id,
      }, this.userService.getAuthenticatedHttpOptions());
  }

  public searchAnnounce(jeu: string, plateforme: string, level: string) {
    return this.http
      .get(`http://localhost:8080/research/${jeu}/${plateforme}/${level}`);
  }

  public deleteAnnounceById(id: number){
    const token = localStorage.getItem('token');

    return this.http
    .delete(`http://localhost:8080/api/delete/${id}`, this.userService.getAuthenticatedHttpOptions());
  }
}
