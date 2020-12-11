import { HttpClient, HttpHeaders } from '@angular/common/http';
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

public getUser() {
  return this.http.get(this.url +`user`, this.getAuthenticatedHttpOptions());
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

public getAuthenticatedHttpOptions(): any {
  const token = localStorage.getItem('token');
  if (token) {
    return {
      headers: new HttpHeaders({
        Authorization: `Basic ${token}`,
      })
    };
  }
  return undefined;
}
}