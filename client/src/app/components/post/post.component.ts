import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  model: any;
  constructor(private http: HttpClient) { }

  ngOnInit(): void {

    this.model = {};
  }

  postAnnounce(){

    const token = localStorage.getItem('token');
    
   this.http
   .post("http://localhost:8080/search/post", {
        "titre": this.model.titre,
        "message": this.model.message,
        "niveau" : this.model.level,
        "plateforme" : this.model.plateforme,
        "jeux" : this.model.game
   },{
    headers: new HttpHeaders({
    Authorization: `Basic ${token}`,
  })
})
.subscribe(() => {
  this.ngOnInit();
},
error => {
  console.log(error)
})
  }

}
