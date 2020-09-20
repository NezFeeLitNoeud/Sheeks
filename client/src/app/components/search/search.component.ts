import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { AnnonceService } from 'src/app/services/annonce.service';

interface announceInterface {
  id: number;
  jeux: string;
  message: string;
  niveau: string;
  plateforme: string;
  titre: string;  
  user_pseudo: string;
}

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  annonce: any;

  constructor(private announceService: AnnonceService) { }

  ngOnInit(): void {
    this.announceService.getAnnonce().subscribe(res => this.annonce = res)
    //this.announceService.getAnnonce().subscribe(res => console.log(res))

  }

}
