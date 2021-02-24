import { UserService } from 'src/app/services/users/user.service';
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
              public route: ActivatedRoute, private userService: UserService, private router: Router) { }

    id: any;
    annonce: any;
    titleGame: string;
    loggedUser: any;
    showCross = false;
    authorAnnounce: any;
    status: string;


  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get('id');

    this.announceService.getAnnonceById(this.id).subscribe(res => {
    this.annonce = res;
    });

    this.userService.getUser().subscribe(res => {
      this.loggedUser = res;

      if (this.annonce.user.pseudo === this.loggedUser.pseudo) {
        console.log('it matches');
        this.showCross = true
      } else {
        console.log('not working');
        this.showCross = false
      }
    });
    this.titleGame = localStorage.getItem('game');


  }

  deleteAnnounce() {
this.announceService.deleteAnnounceById(this.id)
.subscribe(res => {
this.status = "Annonce effacée";
console.log(this.status)
this.router.navigate(["/delete"]);
});
  }
}
