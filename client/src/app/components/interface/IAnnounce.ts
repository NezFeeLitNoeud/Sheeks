import { IUser } from './iuser';

export interface IAnnonce {
    id: number,
    message: String,
    level: String,
    plateforme: String,
    titre: String,
    author: IUser
}
