import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
Menu: String[] = [
"More",
"Recherche",
"Poster",
"Connexion",
"Inscription"
];

  constructor() { }

  ngOnInit() {
    
    console.log(this.Menu[0]);
  }



}
