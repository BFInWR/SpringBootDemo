package com.myspringboot.springboot.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

/**
 * @author ： @gf
 * Create on 2018/6/29 10:16
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ViewDataPage {
    private Object rows;
    private long records;
    private int page;
    private int total;

    public static ViewDataPage of(Page page){
        return new ViewDataPage(page.getContent(),page.getTotalElements(),page.getNumber()+1,page.getTotalPages());
    }
}
