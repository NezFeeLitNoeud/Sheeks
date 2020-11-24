import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
Menu: String[] = [
"more",
"recherche",
"poster",
"connexion",
"inscription"
];

  constructor() { }

  ngOnInit() {

  }

  loggedIn(): boolean {
    return localStorage.getItem('token') && localStorage.getItem('token').length !==0;
  }



}
