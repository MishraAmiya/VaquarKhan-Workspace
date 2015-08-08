package pages

import geb.Page

class CreateOrderPage extends Page {
    static url = "create-order.jsp"
    static at = { $("h2").text() == "Create Order" }
    static content = {
        form { $("form") }
        item { form.find("input[name='item']") }
        amount { form.find("input[name='amount']") }
        submit { form.find("input[type='submit']") }
    }

    def createOrder(item1, amount1) {
        item = item1
        amount = amount1
        submit.click()
    }
}