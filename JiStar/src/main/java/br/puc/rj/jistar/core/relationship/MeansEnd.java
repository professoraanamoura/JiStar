/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.rj.jistar.core.relationship;

import br.puc.rj.jistar.core.elements.Goals;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 *
 * @author anamm
 */
@Documented
@Target(value=ElementType.METHOD)
@Retention(value=RetentionPolicy.RUNTIME)
@Repeatable(MeansEnds.class)
public @interface MeansEnd {
    MeansEndType endType();
    String end();
}
