import { SuccessfulDeleteComponent } from './components/Recherche/successful-delete/successful-delete.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ConnexionComponent } from './components/User/connexion/connexion.component';
import { InscriptionComponent } from './components/User/inscription/inscription.component';
import { LogoutComponent } from './components/User/logout/logout.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { SearchComponent } from './components/Recherche/home/search.component';
import { DisplaySearchComponent } from './components/Recherche/display-search/display-search.component';
import { AuthGuardGuard } from './components/auth/auth-guard.guard'
import { ProfilComponent } from './components/User/profil/profil.component';
import { PostComponent } from './components/post/post.component';
import { ResearchComponent } from './components/Recherche/research/research.component';
const routes: Routes = [
  {path: '', component: NavbarComponent},
  {path: 'inscription', component: InscriptionComponent},
  {path: 'connexion', component: ConnexionComponent},
  {path: 'logout', component: LogoutComponent},
  {path: 'search/:jeux/:plateforme/:niveau', component: SearchComponent},
  {path: 'research', component: ResearchComponent},
  {path: 'profil', component: ProfilComponent},
  {path: 'poster', component: PostComponent},
  {path: 'search/announce/:id', component: DisplaySearchComponent},
  {path: 'delete', component: SuccessfulDeleteComponent}
  // {path: '**', component: Component Pour page pas trouver}
  // , canActivate: [AuthGuardGuard]
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
