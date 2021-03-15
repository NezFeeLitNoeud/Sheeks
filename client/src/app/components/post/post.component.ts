import {
  HttpClient,
  HttpHeaders
} from '@angular/common/http';
import {
  Component,
  OnInit
} from '@angular/core';
import { Router } from '@angular/router';
import {
  AnnonceService
} from 'src/app/services/annonce/annonce.service';
import {
  UserService
} from 'src/app/services/users/user.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  model: any;
  constructor(private announceService: AnnonceService, private route: Router) {}

  ngOnInit(): void {

    this.model = {};
  }

  postAnnounce() {

    const token = localStorage.getItem('token');
    this.announceService.postAnnounce(this.model.titre, this.model.message, this.model.level, this.model.plateforme, this.model.game)
      .subscribe(() => {
          this.route.navigate(['/']);
        },
        error => {
          console.log(error)
        })
  }
}
