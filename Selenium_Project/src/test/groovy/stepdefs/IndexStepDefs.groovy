package stepdefs

import pages.CreateOrderPage
import pages.IndexPage

import static cucumber.api.groovy.EN.*

Given(~"I'm at the index page") { ->
    to IndexPage
    at IndexPage
}
When(~"I click 'Create Order'") { ->
    page.clickCreateOrder()
}
Then(~"I see the create order page") { ->
    at CreateOrderPage
}
Given(~"I'm at the create order page") { ->
    to CreateOrderPage
    at CreateOrderPage
}
When(~"I enter (.*) (.*)") { item, amount ->
    at CreateOrderPage
    page.createOrder(item, amount)
}
