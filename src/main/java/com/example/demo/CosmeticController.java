package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
public class CosmeticController {




        List<Cosmetic> cosmetics = new ArrayList<>(Arrays.asList(
                new Cosmetic("LIP001","XOXO Lipstick",1),
                new Cosmetic("BR001","NYX Brush On Palette" ,1 )
        ));

        @RequestMapping("/cosmetics")
        public List<Cosmetic> getAllCosmetics(){
            return cosmetics;
        }


        @DeleteMapping ("/cosmetics/{id}")
        public String deleteCosmetics(@PathVariable String id){

            for (int i=0; i<cosmetics.size(); i++){
                if (cosmetics.get(i).getId().equals(id)){
                    cosmetics.remove(i);
                    break;
                }
            }
            return "";
        }



}
