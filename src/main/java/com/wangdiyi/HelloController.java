package com.wangdiyi;

import com.wangdiyi.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Request;

/**
 * Created by uas on 2017/5/24.
 */
@RestController
public class HelloController {

   /* @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;*/
    @Autowired
    private GirlProperties girlProperties;


    @RequestMapping(value = {"/hello","/hi"}, method = RequestMethod.POST)
    public String say(){
        return girlProperties.getCupSize()+"ff";
    }

    @GetMapping("/h1")
    public String heelo(@RequestParam(value = "id" ,required = false,defaultValue = "0")Integer i){
        return i+"";
    }

    @GetMapping("/h1/{id}")
    public String h2(@PathVariable("id") Integer id){
        return id+"";
    }
}
