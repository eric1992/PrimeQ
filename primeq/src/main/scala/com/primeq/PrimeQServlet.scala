package com.primeq

import org.scalatra._

class PrimeQServlet extends PrimeqStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

  get("/prime/:i"){

  }

  get("/even/:i"){
    <html>
      <h1>The nth even number is {com.primeq.Evens.get(params("i").toInt)}</h1>
    </html>
  }

}
