# UML Class Diagram

Here is a UML class diagram, specified using [Mermaid][mer].

```mermaid
classDiagram
  Customer -- Order : places, Order -- OrderItem : includes
  class OrderItem {
    name: String
    description: String
  }
  class Order{
    orderNumber: Int
    datePlaced: Int
    deliveryDate: Int
    checkStock(customer: Customer)
    takePayment(customer: Customer)
  }
  class Customer{
    name: String
    address: String
    placeOrder(order: Order)
  }
```


[mer]: https://mermaid.js.org/
