import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type' : 'application/json'})
};

@Injectable({
  providedIn: 'root'
})
export class BikeService {

  constructor(private http: HttpClient) {

   }

   getBikes() {
     return this.http.get('/server/api/bikes');
   }

   getBike(id: number) {
     return this.http.get('server/api/bikes/' + id);
   }

   createBikeRegistration(bike) {
     let body = JSON.stringify(bike);
     return this.http.post('/server/api/bikes', body, httpOptions);
   }
}
