Sample Apps from http://acdcjunior.github.io/
===
Fork to reproduce Primefaces "ctrl + v"-Bug

Steps to reproduce
---
1. Checkout project
1. go to "jsf-primefaces-jaas-tomcat-example": `cd jsf-primefaces-jaas-tomcat-example`
1. Run it using: `mvn tomcat7:run`
1. Open your browser on: http://127.0.0.1:8080/jsf-primefaces-jaas-tomcat-example/
1. Copy any image from your computer to the clipboard (ctrl + c)
1. Go back to brower, press "ctrl + v" and see file in fileUpload-Component


Observations
---
1. if you turn on "autoupload" for fileupload-component, FileUploadListener in Class "ExampleManagedBean" is called.