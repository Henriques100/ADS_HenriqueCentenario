import { BookDTO } from './../dtos/BookDTO';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class BookService{
  constructor(private client: HttpClient) { }
  public findAllBooks(): Observable<Book[]>{
    return this.client.get<Book[]>('http://localhost:8080/book');
  }
}
