import { Component, Input, OnInit } from '@angular/core';
import { AnnonceService } from 'src/app/services/annonce/annonce.service';
import { IAnnonce } from '../../interface/IAnnounce';
import { IAnswer } from '../../interface/IAnswer';

@Component({
  selector: 'app-answer',
  templateUrl: './answer.component.html',
  styleUrls: ['./answer.component.css']
})
export class AnswerComponent implements OnInit {
  @Input() id:number;

  answer: any;
  annonceId: number;
  constructor(public announceService: AnnonceService) { }

  ngOnInit(): void {
    this.annonceId = this.id
    this.announceService.getAnswerFromAnnounce(this.annonceId).subscribe(res => {
      this.answer = res;
    console.log(this.answer);
    });
   
  }
}
