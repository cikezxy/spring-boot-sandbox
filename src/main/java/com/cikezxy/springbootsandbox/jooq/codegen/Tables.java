/*
 * This file is generated by jOOQ.
 */
package com.cikezxy.springbootsandbox.jooq.codegen;


import com.cikezxy.springbootsandbox.jooq.codegen.tables.*;

import javax.annotation.Generated;

/**
 * Convenience access to all tables in sakila
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>sakila.actor</code>.
     */
    public static final Actor ACTOR = Actor.ACTOR;

    /**
     * VIEW
     */
    public static final ActorInfo ACTOR_INFO = ActorInfo.ACTOR_INFO;

    /**
     * The table <code>sakila.address</code>.
     */
    public static final Address ADDRESS = Address.ADDRESS;

    /**
     * The table <code>sakila.category</code>.
     */
    public static final Category CATEGORY = Category.CATEGORY;

    /**
     * The table <code>sakila.city</code>.
     */
    public static final City CITY = City.CITY;

    /**
     * The table <code>sakila.country</code>.
     */
    public static final Country COUNTRY = Country.COUNTRY;

    /**
     * The table <code>sakila.customer</code>.
     */
    public static final Customer CUSTOMER = Customer.CUSTOMER;

    /**
     * VIEW
     */
    public static final CustomerList CUSTOMER_LIST = CustomerList.CUSTOMER_LIST;

    /**
     * The table <code>sakila.film</code>.
     */
    public static final Film FILM = Film.FILM;

    /**
     * The table <code>sakila.film_actor</code>.
     */
    public static final FilmActor FILM_ACTOR = FilmActor.FILM_ACTOR;

    /**
     * The table <code>sakila.film_category</code>.
     */
    public static final FilmCategory FILM_CATEGORY = FilmCategory.FILM_CATEGORY;

    /**
     * VIEW
     */
    public static final FilmList FILM_LIST = FilmList.FILM_LIST;

    /**
     * The table <code>sakila.film_text</code>.
     */
    public static final FilmText FILM_TEXT = FilmText.FILM_TEXT;

    /**
     * The table <code>sakila.inventory</code>.
     */
    public static final Inventory INVENTORY = Inventory.INVENTORY;

    /**
     * The table <code>sakila.language</code>.
     */
    public static final Language LANGUAGE = Language.LANGUAGE;

    /**
     * VIEW
     */
    public static final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST;

    /**
     * The table <code>sakila.payment</code>.
     */
    public static final Payment PAYMENT = Payment.PAYMENT;

    /**
     * The table <code>sakila.rental</code>.
     */
    public static final Rental RENTAL = Rental.RENTAL;

    /**
     * VIEW
     */
    public static final SalesByFilmCategory SALES_BY_FILM_CATEGORY = SalesByFilmCategory.SALES_BY_FILM_CATEGORY;

    /**
     * VIEW
     */
    public static final SalesByStore SALES_BY_STORE = SalesByStore.SALES_BY_STORE;

    /**
     * The table <code>sakila.staff</code>.
     */
    public static final Staff STAFF = Staff.STAFF;

    /**
     * VIEW
     */
    public static final StaffList STAFF_LIST = StaffList.STAFF_LIST;

    /**
     * The table <code>sakila.store</code>.
     */
    public static final Store STORE = Store.STORE;
}