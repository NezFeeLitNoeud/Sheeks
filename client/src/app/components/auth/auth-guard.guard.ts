import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardGuard implements CanActivate {

  constructor(private router: Router) {  }
  
  canActivate(
    next: ActivatedRouteSnapshot,
  state: RouterStateSnapshot): boolean {
  if (Boolean(localStorage.getItem('token'))) {
    return true;
  } else {
  this.router.navigateByUrl('/connexion'); 
  return false;

  } }}
