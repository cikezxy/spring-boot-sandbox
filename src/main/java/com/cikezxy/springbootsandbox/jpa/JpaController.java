package com.cikezxy.springbootsandbox.jpa;

import com.cikezxy.springbootsandbox.jpa.entity.Actor;
import com.cikezxy.springbootsandbox.jpa.entity.Customer;
import com.cikezxy.springbootsandbox.jpa.entity.Film;
import com.cikezxy.springbootsandbox.jpa.entity.Inventory;
import com.cikezxy.springbootsandbox.jpa.repository.ActorRepository;
import com.cikezxy.springbootsandbox.jpa.repository.CustomerRepository;
import com.cikezxy.springbootsandbox.jpa.repository.FilmRepository;
import com.cikezxy.springbootsandbox.jpa.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;
import java.util.List;

@RestController
public class JpaController {

    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping("/jpa/actors")
    public List<Actor> findActorByFirstName(@RequestParam("firstName") String firstName) {
        return actorRepository.findByFirstName(firstName);
    }

    @GetMapping("/jpa/customers")
    public List<Customer> findCustomerByFirstName(@RequestParam("firstName") String firstName) {
        return customerRepository.findByFirstName(firstName);
    }

    @GetMapping("/jpa/film/{id}")
    public Film findFilmById(@PathVariable("id") Long id) {
        Film film = filmRepository.findById(id).orElse(null);
        System.out.println(film);
        return film;
    }

    @GetMapping("/jpa/inventory/{id}")
    public Inventory findInventoryById(@PathVariable("id") Long id) {
        return inventoryRepository.findById(id).orElse(null);
    }
}
