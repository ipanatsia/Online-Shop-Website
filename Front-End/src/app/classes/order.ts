
export class Order {
    id : Number;
    name : String;
    cost: Number;
    client_id: Number;
    
     constructor (name, cost, client_id) {
                 this.name = name;
                 this.cost = cost;
                 this.client_id = client_id;
             }
}




