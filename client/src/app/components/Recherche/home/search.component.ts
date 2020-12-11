import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AnnonceService } from 'src/app/services/annonce/annonce.service';


@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  annonce: any;
jeux: string;
plateforme: string;
level: string;

  constructor(private announceService: AnnonceService,
    public router: Router, public param: ActivatedRoute) { }

  ngOnInit(): void {
    this.jeux = this.param.snapshot.paramMap.get('jeux');
    this.plateforme = this.param.snapshot.paramMap.get('plateforme');
    this.level = this.param.snapshot.paramMap.get('niveau')

    this.announceService.searchAnnounce(this.jeux, this.plateforme, this.level)
    .subscribe(res => {
      this.annonce= res;
    })
    // this.announceService.getEveryAnnonce().subscribe(res => {
    // this.annonce = res;
    // })

  }

  navigateToAnnounce(id: number, nom: string){
    this.router.navigateByUrl('search/announce/' + id)
    localStorage.setItem('game', nom);
  }

}
