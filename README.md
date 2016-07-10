# DaggerBehaviour

This is a situation i've observed with Dagger 2. Where if you have a subclass in a seperate module from your generated injectors in dependant module, it will fail to properly create providers for the injectors.

[Here is an image of the error](http://puu.sh/pWI8Z/b95b3bc58f.png)


Posting:

```Information:Gradle tasks [clean, :app:generateDebugSources, :app:mockableAndroidJar, :app:prepareDebugUnitTestDependencies, :app:generateDebugAndroidTestSources, :app:compileDebugSources, :app:compileDebugUnitTestSources, :app:compileDebugAndroidTestSources, :othermodule:generateDebugSources, :othermodule:mockableAndroidJar, :othermodule:prepareDebugUnitTestDependencies, :othermodule:generateDebugAndroidTestSources, :othermodule:compileDebugSources, :othermodule:compileDebugUnitTestSources, :othermodule:compileDebugAndroidTestSources]
/Users/patrykpoborca/Documents/consulting/plagrounds/app/build/generated/source/apt/debug/patrykpoborca/io/plagrounds/DaggerActivityComponent.java
Error:(11, 50) error: cannot find symbol class ActivityModule_ProvidesBaseActivityFactory
Error:Execution failed for task ':app:compileDebugJavaWithJavac'.
> Compilation failed; see the compiler error output for details.
Information:BUILD FAILED
Information:Total time: 6.304 secs```
