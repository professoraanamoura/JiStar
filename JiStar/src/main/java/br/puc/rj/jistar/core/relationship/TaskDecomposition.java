/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.rj.jistar.core.relationship;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import br.puc.rj.jistar.core.elements.Task;
import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;

/**
 *
 * @author anamm
 */
@Documented
@Retention(value=RetentionPolicy.SOURCE)
@Target(value={ElementType.TYPE_USE,ElementType.METHOD, ElementType.PARAMETER})
@Repeatable(TaskDecompositions.class)
public @interface TaskDecomposition {
    TaskDecompositionType type() default TaskDecompositionType.SUB_TASK;
    String element();
}
