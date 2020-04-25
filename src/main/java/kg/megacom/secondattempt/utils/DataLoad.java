package kg.megacom.secondattempt.utils;

import kg.megacom.secondattempt.models.Status;
import kg.megacom.secondattempt.repositories.StatusRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.ignoreCase;

@Component
public class DataLoad implements ApplicationRunner {

    private StatusRep statusRep;
@Autowired
    public DataLoad(StatusRep statusRep){
        this.statusRep=statusRep;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("data load");

        List<Status> list= Arrays.asList(
                new Status("Active"),
                new Status("Closed")
        );

        ExampleMatcher matcher=ExampleMatcher.matching()
                .withIgnorePaths("id")
                .withMatcher("name",ignoreCase());



        list.stream()
                .forEach(x->{
                    if (!statusRep.exists(Example.of(x,matcher))){
                        System.out.println("loaded");
                        statusRep.save(x);
                    }
                });


        statusRep.saveAll(list);
    }
}
