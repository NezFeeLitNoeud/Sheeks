import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AnnonceService } from 'src/app/services/annonce/annonce.service';
import { JeuxService } from 'src/app/services/jeux/jeux.service';

@Component({
  selector: 'app-research',
  templateUrl: './research.component.html',
  styleUrls: ['./research.component.css']
})
export class ResearchComponent implements OnInit {
jeux:any;
model: any;
plateformes: string[] = ['PS4', 'xBox', 'PC', 'Switch'];
levels: string[] = ['Chill', 'Ranked', 'eSport'];

  constructor(public jeuxService: JeuxService, public annonceService: AnnonceService, private router: Router) { }

  ngOnInit(): void {
    this.model = {};
    this.jeuxService.getAllGame()
    .subscribe(res => {
      this.jeux = res;

    } );
  }

  searchAnnounce(){
    this.router.navigate(["/search/" + this.model.jeu + "/" + this.model.plateforme + "/" + this.model.level]);
  }
}
