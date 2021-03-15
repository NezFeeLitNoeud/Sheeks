import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-successful-delete',
  templateUrl: './successful-delete.component.html',
  styleUrls: ['./successful-delete.component.css']
})
export class SuccessfulDeleteComponent implements OnInit {

  constructor(private router : Router) { }

  ngOnInit() {
    setTimeout(() => {
      this.router.navigate(['/']);
  }, 3000);  //3s
  }

}
