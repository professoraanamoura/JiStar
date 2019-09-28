/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jistar.core.elements;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author anamm
 */
@Documented
@Retention(value=RetentionPolicy.SOURCE)
@Repeatable(Softgoals.class)
public @interface Softgoal {
    String name();
    String description() default "";
}
