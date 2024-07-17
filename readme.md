Micronaut: 
configuration properties of Map type that have digits in name are processed incorrectly

https://youtrack.jetbrains.com/issue/IDEA-240367

n/r with the new Micronaut versions: the different property name is used

(`my.confprops.cp3.enum1-enum2-map`
vs
`my.confprops.cp3.enum1enum2map`)
and everything is fine