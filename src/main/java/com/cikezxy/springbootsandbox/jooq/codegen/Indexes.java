/*
 * This file is generated by jOOQ.
 */
package com.cikezxy.springbootsandbox.jooq.codegen;


import javax.annotation.Generated;

import com.cikezxy.springbootsandbox.jooq.codegen.tables.*;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

/**
 * A class modelling indexes of tables of the <code>sakila</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACTOR_IDX_ACTOR_LAST_NAME = Indexes0.ACTOR_IDX_ACTOR_LAST_NAME;
    public static final Index ACTOR_PRIMARY = Indexes0.ACTOR_PRIMARY;
    public static final Index ADDRESS_IDX_FK_CITY_ID = Indexes0.ADDRESS_IDX_FK_CITY_ID;
    public static final Index ADDRESS_IDX_LOCATION = Indexes0.ADDRESS_IDX_LOCATION;
    public static final Index ADDRESS_PRIMARY = Indexes0.ADDRESS_PRIMARY;
    public static final Index CATEGORY_PRIMARY = Indexes0.CATEGORY_PRIMARY;
    public static final Index CITY_IDX_FK_COUNTRY_ID = Indexes0.CITY_IDX_FK_COUNTRY_ID;
    public static final Index CITY_PRIMARY = Indexes0.CITY_PRIMARY;
    public static final Index COUNTRY_PRIMARY = Indexes0.COUNTRY_PRIMARY;
    public static final Index CUSTOMER_IDX_FK_ADDRESS_ID = Indexes0.CUSTOMER_IDX_FK_ADDRESS_ID;
    public static final Index CUSTOMER_IDX_FK_STORE_ID = Indexes0.CUSTOMER_IDX_FK_STORE_ID;
    public static final Index CUSTOMER_IDX_LAST_NAME = Indexes0.CUSTOMER_IDX_LAST_NAME;
    public static final Index CUSTOMER_PRIMARY = Indexes0.CUSTOMER_PRIMARY;
    public static final Index FILM_IDX_FK_LANGUAGE_ID = Indexes0.FILM_IDX_FK_LANGUAGE_ID;
    public static final Index FILM_IDX_FK_ORIGINAL_LANGUAGE_ID = Indexes0.FILM_IDX_FK_ORIGINAL_LANGUAGE_ID;
    public static final Index FILM_IDX_TITLE = Indexes0.FILM_IDX_TITLE;
    public static final Index FILM_PRIMARY = Indexes0.FILM_PRIMARY;
    public static final Index FILM_ACTOR_IDX_FK_FILM_ID = Indexes0.FILM_ACTOR_IDX_FK_FILM_ID;
    public static final Index FILM_ACTOR_PRIMARY = Indexes0.FILM_ACTOR_PRIMARY;
    public static final Index FILM_CATEGORY_FK_FILM_CATEGORY_CATEGORY = Indexes0.FILM_CATEGORY_FK_FILM_CATEGORY_CATEGORY;
    public static final Index FILM_CATEGORY_PRIMARY = Indexes0.FILM_CATEGORY_PRIMARY;
    public static final Index FILM_TEXT_IDX_TITLE_DESCRIPTION = Indexes0.FILM_TEXT_IDX_TITLE_DESCRIPTION;
    public static final Index FILM_TEXT_PRIMARY = Indexes0.FILM_TEXT_PRIMARY;
    public static final Index INVENTORY_IDX_FK_FILM_ID = Indexes0.INVENTORY_IDX_FK_FILM_ID;
    public static final Index INVENTORY_IDX_STORE_ID_FILM_ID = Indexes0.INVENTORY_IDX_STORE_ID_FILM_ID;
    public static final Index INVENTORY_PRIMARY = Indexes0.INVENTORY_PRIMARY;
    public static final Index LANGUAGE_PRIMARY = Indexes0.LANGUAGE_PRIMARY;
    public static final Index PAYMENT_FK_PAYMENT_RENTAL = Indexes0.PAYMENT_FK_PAYMENT_RENTAL;
    public static final Index PAYMENT_IDX_FK_CUSTOMER_ID = Indexes0.PAYMENT_IDX_FK_CUSTOMER_ID;
    public static final Index PAYMENT_IDX_FK_STAFF_ID = Indexes0.PAYMENT_IDX_FK_STAFF_ID;
    public static final Index PAYMENT_PRIMARY = Indexes0.PAYMENT_PRIMARY;
    public static final Index RENTAL_IDX_FK_CUSTOMER_ID = Indexes0.RENTAL_IDX_FK_CUSTOMER_ID;
    public static final Index RENTAL_IDX_FK_INVENTORY_ID = Indexes0.RENTAL_IDX_FK_INVENTORY_ID;
    public static final Index RENTAL_IDX_FK_STAFF_ID = Indexes0.RENTAL_IDX_FK_STAFF_ID;
    public static final Index RENTAL_PRIMARY = Indexes0.RENTAL_PRIMARY;
    public static final Index RENTAL_RENTAL_DATE = Indexes0.RENTAL_RENTAL_DATE;
    public static final Index STAFF_IDX_FK_ADDRESS_ID = Indexes0.STAFF_IDX_FK_ADDRESS_ID;
    public static final Index STAFF_IDX_FK_STORE_ID = Indexes0.STAFF_IDX_FK_STORE_ID;
    public static final Index STAFF_PRIMARY = Indexes0.STAFF_PRIMARY;
    public static final Index STORE_IDX_FK_ADDRESS_ID = Indexes0.STORE_IDX_FK_ADDRESS_ID;
    public static final Index STORE_IDX_UNIQUE_MANAGER = Indexes0.STORE_IDX_UNIQUE_MANAGER;
    public static final Index STORE_PRIMARY = Indexes0.STORE_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ACTOR_IDX_ACTOR_LAST_NAME = Internal.createIndex("idx_actor_last_name", Actor.ACTOR, new OrderField[] { Actor.ACTOR.LAST_NAME }, false);
        public static Index ACTOR_PRIMARY = Internal.createIndex("PRIMARY", Actor.ACTOR, new OrderField[] { Actor.ACTOR.ACTOR_ID }, true);
        public static Index ADDRESS_IDX_FK_CITY_ID = Internal.createIndex("idx_fk_city_id", Address.ADDRESS, new OrderField[] { Address.ADDRESS.CITY_ID }, false);
        public static Index ADDRESS_IDX_LOCATION = Internal.createIndex("idx_location", Address.ADDRESS, new OrderField[] { Address.ADDRESS.LOCATION }, false);
        public static Index ADDRESS_PRIMARY = Internal.createIndex("PRIMARY", Address.ADDRESS, new OrderField[] { Address.ADDRESS.ADDRESS_ID }, true);
        public static Index CATEGORY_PRIMARY = Internal.createIndex("PRIMARY", Category.CATEGORY, new OrderField[] { Category.CATEGORY.CATEGORY_ID }, true);
        public static Index CITY_IDX_FK_COUNTRY_ID = Internal.createIndex("idx_fk_country_id", City.CITY, new OrderField[] { City.CITY.COUNTRY_ID }, false);
        public static Index CITY_PRIMARY = Internal.createIndex("PRIMARY", City.CITY, new OrderField[] { City.CITY.CITY_ID }, true);
        public static Index COUNTRY_PRIMARY = Internal.createIndex("PRIMARY", Country.COUNTRY, new OrderField[] { Country.COUNTRY.COUNTRY_ID }, true);
        public static Index CUSTOMER_IDX_FK_ADDRESS_ID = Internal.createIndex("idx_fk_address_id", Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.ADDRESS_ID }, false);
        public static Index CUSTOMER_IDX_FK_STORE_ID = Internal.createIndex("idx_fk_store_id", Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.STORE_ID }, false);
        public static Index CUSTOMER_IDX_LAST_NAME = Internal.createIndex("idx_last_name", Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.LAST_NAME }, false);
        public static Index CUSTOMER_PRIMARY = Internal.createIndex("PRIMARY", Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
        public static Index FILM_IDX_FK_LANGUAGE_ID = Internal.createIndex("idx_fk_language_id", Film.FILM, new OrderField[] { Film.FILM.LANGUAGE_ID }, false);
        public static Index FILM_IDX_FK_ORIGINAL_LANGUAGE_ID = Internal.createIndex("idx_fk_original_language_id", Film.FILM, new OrderField[] { Film.FILM.ORIGINAL_LANGUAGE_ID }, false);
        public static Index FILM_IDX_TITLE = Internal.createIndex("idx_title", Film.FILM, new OrderField[] { Film.FILM.TITLE }, false);
        public static Index FILM_PRIMARY = Internal.createIndex("PRIMARY", Film.FILM, new OrderField[] { Film.FILM.FILM_ID }, true);
        public static Index FILM_ACTOR_IDX_FK_FILM_ID = Internal.createIndex("idx_fk_film_id", FilmActor.FILM_ACTOR, new OrderField[] { FilmActor.FILM_ACTOR.FILM_ID }, false);
        public static Index FILM_ACTOR_PRIMARY = Internal.createIndex("PRIMARY", FilmActor.FILM_ACTOR, new OrderField[] { FilmActor.FILM_ACTOR.ACTOR_ID, FilmActor.FILM_ACTOR.FILM_ID }, true);
        public static Index FILM_CATEGORY_FK_FILM_CATEGORY_CATEGORY = Internal.createIndex("fk_film_category_category", FilmCategory.FILM_CATEGORY, new OrderField[] { FilmCategory.FILM_CATEGORY.CATEGORY_ID }, false);
        public static Index FILM_CATEGORY_PRIMARY = Internal.createIndex("PRIMARY", FilmCategory.FILM_CATEGORY, new OrderField[] { FilmCategory.FILM_CATEGORY.FILM_ID, FilmCategory.FILM_CATEGORY.CATEGORY_ID }, true);
        public static Index FILM_TEXT_IDX_TITLE_DESCRIPTION = Internal.createIndex("idx_title_description", FilmText.FILM_TEXT, new OrderField[] { FilmText.FILM_TEXT.TITLE, FilmText.FILM_TEXT.DESCRIPTION }, false);
        public static Index FILM_TEXT_PRIMARY = Internal.createIndex("PRIMARY", FilmText.FILM_TEXT, new OrderField[] { FilmText.FILM_TEXT.FILM_ID }, true);
        public static Index INVENTORY_IDX_FK_FILM_ID = Internal.createIndex("idx_fk_film_id", Inventory.INVENTORY, new OrderField[] { Inventory.INVENTORY.FILM_ID }, false);
        public static Index INVENTORY_IDX_STORE_ID_FILM_ID = Internal.createIndex("idx_store_id_film_id", Inventory.INVENTORY, new OrderField[] { Inventory.INVENTORY.STORE_ID, Inventory.INVENTORY.FILM_ID }, false);
        public static Index INVENTORY_PRIMARY = Internal.createIndex("PRIMARY", Inventory.INVENTORY, new OrderField[] { Inventory.INVENTORY.INVENTORY_ID }, true);
        public static Index LANGUAGE_PRIMARY = Internal.createIndex("PRIMARY", Language.LANGUAGE, new OrderField[] { Language.LANGUAGE.LANGUAGE_ID }, true);
        public static Index PAYMENT_FK_PAYMENT_RENTAL = Internal.createIndex("fk_payment_rental", Payment.PAYMENT, new OrderField[] { Payment.PAYMENT.RENTAL_ID }, false);
        public static Index PAYMENT_IDX_FK_CUSTOMER_ID = Internal.createIndex("idx_fk_customer_id", Payment.PAYMENT, new OrderField[] { Payment.PAYMENT.CUSTOMER_ID }, false);
        public static Index PAYMENT_IDX_FK_STAFF_ID = Internal.createIndex("idx_fk_staff_id", Payment.PAYMENT, new OrderField[] { Payment.PAYMENT.STAFF_ID }, false);
        public static Index PAYMENT_PRIMARY = Internal.createIndex("PRIMARY", Payment.PAYMENT, new OrderField[] { Payment.PAYMENT.PAYMENT_ID }, true);
        public static Index RENTAL_IDX_FK_CUSTOMER_ID = Internal.createIndex("idx_fk_customer_id", Rental.RENTAL, new OrderField[] { Rental.RENTAL.CUSTOMER_ID }, false);
        public static Index RENTAL_IDX_FK_INVENTORY_ID = Internal.createIndex("idx_fk_inventory_id", Rental.RENTAL, new OrderField[] { Rental.RENTAL.INVENTORY_ID }, false);
        public static Index RENTAL_IDX_FK_STAFF_ID = Internal.createIndex("idx_fk_staff_id", Rental.RENTAL, new OrderField[] { Rental.RENTAL.STAFF_ID }, false);
        public static Index RENTAL_PRIMARY = Internal.createIndex("PRIMARY", Rental.RENTAL, new OrderField[] { Rental.RENTAL.RENTAL_ID }, true);
        public static Index RENTAL_RENTAL_DATE = Internal.createIndex("rental_date", Rental.RENTAL, new OrderField[] { Rental.RENTAL.RENTAL_DATE, Rental.RENTAL.INVENTORY_ID, Rental.RENTAL.CUSTOMER_ID }, true);
        public static Index STAFF_IDX_FK_ADDRESS_ID = Internal.createIndex("idx_fk_address_id", Staff.STAFF, new OrderField[] { Staff.STAFF.ADDRESS_ID }, false);
        public static Index STAFF_IDX_FK_STORE_ID = Internal.createIndex("idx_fk_store_id", Staff.STAFF, new OrderField[] { Staff.STAFF.STORE_ID }, false);
        public static Index STAFF_PRIMARY = Internal.createIndex("PRIMARY", Staff.STAFF, new OrderField[] { Staff.STAFF.STAFF_ID }, true);
        public static Index STORE_IDX_FK_ADDRESS_ID = Internal.createIndex("idx_fk_address_id", Store.STORE, new OrderField[] { Store.STORE.ADDRESS_ID }, false);
        public static Index STORE_IDX_UNIQUE_MANAGER = Internal.createIndex("idx_unique_manager", Store.STORE, new OrderField[] { Store.STORE.MANAGER_STAFF_ID }, true);
        public static Index STORE_PRIMARY = Internal.createIndex("PRIMARY", Store.STORE, new OrderField[] { Store.STORE.STORE_ID }, true);
    }
}
