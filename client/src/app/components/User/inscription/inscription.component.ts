import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {HttpClient} from "@angular/common/http";
import { UserService } from 'src/app/services/users/user.service';

@Component({
  selector: 'app-inscription',
  templateUrl: './inscription.component.html',
  styleUrls: ['./inscription.component.css']
})
export class InscriptionComponent implements OnInit {
model: any;
passwordMatch: boolean = true;


  constructor(private http: HttpClient, private router: Router, private userService: UserService) { }

  ngOnInit() {
  
    this.model = {};
    localStorage.setItem('token', '');
    localStorage.setItem('pseudo', '');
  }

  verifyPassword(password, confPassword) {
    if(password == confPassword){
      this.passwordMatch = true;
      console.log("Password match")
    } else{
      this.passwordMatch = false;
      console.log("Password Doesn't match");
    }
  }

  register(){
    this.verifyPassword(this.model.password, this.model.confPassword);

    let password = '';

    if(this.passwordMatch == true){
      password = this.model.password;
      this.userService.register(this.model.pseudo, this.model.email, password, this.model.gamertag, this.model.plateforme)
      .subscribe(() => {
        this.router.navigate(["/connexion"])
      },
      error => {
        console.log(`Login failed : ${error}`)
      })
    } else {
      password = null;
    }
  }

}
