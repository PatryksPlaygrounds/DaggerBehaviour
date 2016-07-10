# DaggerBehaviour

This is a situation i've observed with Dagger 2. Where if you have a subclass in a seperate module from your generated injectors in dependant module, it will fail to properly create providers for the injectors.

[Here is an image of the error](http://puu.sh/pWI8N/4916d909ab.png)
