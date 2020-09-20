import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-connexion',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.css']
})
export class ConnexionComponent implements OnInit {
model: any;
isLogged: boolean = true;

  constructor(private http: HttpClient, private router: Router) { }

  ngOnInit(): void {
    this.model = {};
    localStorage.setItem('token', '');
    localStorage.setItem('pseudo', '');
  }

  login() {
    this.http
      .post("http://localhost:8080/login", {
        "pseudo": this.model.pseudo,
        "password": this.model.password,
      })
      .subscribe(() => {
          let base64hash = btoa(this.model.username + ':' + this.model.password);
          localStorage.setItem('token', base64hash);
          localStorage.setItem('pseudo', this.model.pseudo)
          this.router.navigate(["/"])
        },
        error => {
          alert(`Login failed: ${error}`)
        })
  }

}
