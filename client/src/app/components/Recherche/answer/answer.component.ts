import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Route } from '@angular/compiler/src/core';
import { Component, Input, OnInit } from '@angular/core';
import { Router, RouterEvent } from '@angular/router';
import { AnnonceService } from 'src/app/services/annonce/annonce.service';
import { UserService } from 'src/app/services/users/user.service';
import { IAnnonce } from '../../interface/IAnnounce';
import { IAnswer } from '../../interface/IAnswer';

@Component({
  selector: 'app-answer',
  templateUrl: './answer.component.html',
  styleUrls: ['./answer.component.css']
})
export class AnswerComponent implements OnInit {
  @Input() id:number;

  model: any;
  isAnswering: boolean = false;
  answer: any;
  annonceId: number;
  userPseudo: string;
  constructor(private userService: UserService, public announceService: AnnonceService, private http: HttpClient, private router: Router) { }

  ngOnInit(): void {

    this.model = {};
    this.userPseudo = localStorage.getItem('pseudo');
    this.annonceId = this.id
    this.announceService.getAnswerFromAnnounce(this.annonceId).subscribe(res => {
      this.answer = res;
    });
   
  }

  sentResponse(){
    const token = localStorage.getItem('token');
    this.http
      .post("http://localhost:8080/search/answer", {
        "message": this.model.message,
        "announce_id": this.annonceId
      }, {
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

  answering(){
    this.isAnswering = !this.isAnswering;
  }

  private static getAuthenticatedHttpOptions(): any {
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
