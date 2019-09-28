/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jistar.core.elements;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author anamm
 */
@Documented
@Retention(value=RetentionPolicy.SOURCE)
@Target(value={ElementType.FIELD,ElementType.TYPE,ElementType.LOCAL_VARIABLE})
public @interface Resource {
    String name();
}