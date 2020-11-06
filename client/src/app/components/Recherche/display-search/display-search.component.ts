import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AnnonceService } from 'src/app/services/annonce/annonce.service';

interface announceInterface {
  id: number;
  jeux: Object;
  message: string;
  niveau: string;
  plateforme: string;
  titre: string;  
  user_pseudo: string;
}


@Component({
  selector: 'app-display-search',
  templateUrl: './display-search.component.html',
  styleUrls: ['./display-search.component.css']
})
export class DisplaySearchComponent implements OnInit {

  constructor(private announceService: AnnonceService,
    public route: ActivatedRoute) { }

    id: any;
    annonce: any;

  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get('id');
    console.log(this.id);

    this.announceService.getAnnonceById(this.id).subscribe(res => {
this.annonce = res;
        console.log(this.annonce)
    })
  
    
  }

}
