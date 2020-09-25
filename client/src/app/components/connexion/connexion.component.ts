import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from 'src/app/services/users/user.service';

@Component({
  selector: 'app-connexion',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.css']
})
export class ConnexionComponent implements OnInit {
model: any;
isLogged: boolean;

  constructor(private http: HttpClient, private router: Router, private userService: UserService) { }

  ngOnInit(): void {
    this.model = {};
    localStorage.setItem('token', '');
    localStorage.setItem('pseudo', '');
  }

  login() {
    this.userService.login(this.model.pseudo, this.model.password)
      .subscribe(() => {
          let base64hash = btoa(this.model.username + ':' + this.model.password);
          localStorage.setItem('token', base64hash);
          localStorage.setItem('pseudo', this.model.pseudo)
          this.isLogged = true;
          this.router.navigate(["/"])
        },
        error => {
          if(error.status === 401) {
            this.isLogged = false;
            console.log('Athentification failed probably because of bad credentialds');
          } else if (error.status === 500){
            alert('Internal Server Error.')
            console.log(error)
          }
        })
  }

}
