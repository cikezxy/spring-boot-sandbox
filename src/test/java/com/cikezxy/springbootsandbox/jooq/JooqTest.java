package com.cikezxy.springbootsandbox.jooq;

import com.cikezxy.springbootsandbox.jooq.codegen.tables.Actor;
import com.cikezxy.springbootsandbox.jooq.codegen.tables.Film;
import com.cikezxy.springbootsandbox.jooq.codegen.tables.FilmActor;
import org.jooq.DSLContext;
import org.jooq.Record3;
import org.jooq.Result;
import org.jooq.types.UShort;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JooqTest {
    @Autowired
    private DSLContext create;

    private Actor a = Actor.ACTOR.as("a");
    private FilmActor fa = FilmActor.FILM_ACTOR.as("fa");
    private Film f = Film.FILM.as("f");

    @Test
    public void testQuery() {
        Result<Record3<UShort, UShort, String>> result = create.select(a.ACTOR_ID, f.FILM_ID, f.TITLE)
                .from(a)
                .innerJoin(fa).on(fa.ACTOR_ID.eq(a.ACTOR_ID))
                .innerJoin(f).on(fa.FILM_ID.eq(f.FILM_ID))
                .where(a.ACTOR_ID.eq(UShort.valueOf(1)))
                .orderBy(f.FILM_ID)
                .fetch();

        assertEquals(19,result.size());
        assertEquals("ACADEMY DINOSAUR",result.getValue(0,f.TITLE));
    }
}
