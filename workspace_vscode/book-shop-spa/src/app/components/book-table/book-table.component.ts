import { BookService } from './../../services/book.service';
import { BookDTO } from './../../dtos/BookDTO';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.scss']
})
export class BookTableComponent implements OnInit{

  books : BookDTO[] = [];

  constructor(private service: BookService) {}


  /*
  ngOnInit(): void{
    this.books =[
      {id:1,  title:'Engenharia de Software Moderna', category:'Software' }
      ,
      {id:2, title:'Recnica Pomodoro', category:'Produtividade'}
      ,
      {id:3, title:'Fazendas do Café', category:'Arquitetura'}
    ];

  }
  */
  ngOnInit():void{
    this.service.findAllBooks()
    .subscribe({
      next: (data) => this.books = data
      ,
      error: (e) => console.error(e)
    });
  }

}
