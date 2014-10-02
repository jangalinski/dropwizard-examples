package de.holisticon.dropwizard.example.scala

import javax.xml.bind.annotation.XmlRootElement

import io.dropwizard.Configuration

@XmlRootElement
case class ExampleConfiguration(name:String) extends Configuration