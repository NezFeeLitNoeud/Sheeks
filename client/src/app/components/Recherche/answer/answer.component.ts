import { Component, OnInit } from '@angular/core';
import { AnnonceService } from 'src/app/services/annonce/annonce.service';

@Component({
  selector: 'app-answer',
  templateUrl: './answer.component.html',
  styleUrls: ['./answer.component.css']
})
export class AnswerComponent implements OnInit {
answer: any;
  constructor(public announceService: AnnonceService) { }

  ngOnInit(): void {
    this.announceService.getAnswerFromAnnounce(1).subscribe(res => {
      this.answer = res;
      console.log(this.answer);
    });
  }

}
