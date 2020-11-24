import { IAnnonce } from './IAnnounce';
import { IUser } from './iuser';

export interface IAnswer {
    id: number,
    creation_date: String,
    message: String,
    author: String,
    annonce: IAnnonce;

}
