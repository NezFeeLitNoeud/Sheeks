import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
url: string = 'http://localhost:8080/';
  constructor(private http: HttpClient) { }

public login(pseudo: string, password:string) {
return this.http.post(this.url + `login`, {
pseudo: pseudo,
password: password
})
}

public register(pseudo:string, email:string, password:string, gamertag:string, plateforme: string) {

  return this.http
  .post(this.url + `register`, {
pseudo: pseudo,
email: email,
password: password,
gamertag: gamertag,
plateforme: plateforme
  })


}
}