import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AnnonceService } from 'src/app/services/annonce/annonce.service';


@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  annonce: any;

  constructor(private announceService: AnnonceService,
    public router: Router) { }

  ngOnInit(): void {
    this.announceService.getEveryAnnonce().subscribe(res => this.annonce = res)
    //this.announceService.getAnnonce().subscribe(res => console.log(res))

  }

  navigateToAnnounce(id: number, nom: string){
    this.router.navigateByUrl('search/announce/' + id)
    localStorage.setItem('game', nom);
  }

}
