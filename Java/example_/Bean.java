package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bean")
public class Bean {

    @SuppressWarnings("unused")
	private String name;
    @SuppressWarnings("unused")
	private int age;
    @SuppressWarnings("unused")
	private boolean isMale;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Bean> getBean() {
        Bean bean = new Bean();
        bean.setName("Bard");
        bean.setAge(25);
        bean.setMale(true);
        return ResponseEntity.ok(bean);
    }

	private void setMale(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private void setAge(int i) {
		// TODO Auto-generated method stub
		
	}

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}

}
