package io.github.acdcjunior.jsfexample.web;

import org.primefaces.event.FileUploadEvent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ExampleManagedBean {

    public void fileUploadListener(FileUploadEvent event) {
        System.out.println("see the magic happen");
    }
}