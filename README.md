# **DANGER** The use of this program can crash or damage your computer! Only use it, if you know what are you doing! **DANGER**

# jproblemgenerator - what does it do?
jproblemgenerator creates scenarios in which Java programs leak memory or crash the JVM. It is intended to train the use of debugging tools like [VisualVM](https://visualvm.github.io/) or [Eclipse Memory Analyzer](https://www.eclipse.org/mat/).

# jproblemgenerator - usage
Always run it with the option `-Xmx1024m` to prevent it from using all RAM. Change the amount of memory according to your hardware.

`java -Xmx1024m -jar jproblemgenerator-jar-with-dependencies.jar` --> prints help

`java -Xmx1024m -jar jproblemgenerator-jar-with-dependencies.jar -bigHashMap` --> creates a big HashMap and waits for you to hit enter to terminate. That gives you the chance to take a dump of the program.

Help:

    usage: jproblemgenerator [-bigArrayInt] [-bigArrayInteger] [-bigHashMap] [-bigList] [-crashJVM]
       [-hashSetWithDuplicateEntries] [-heapOverflow] [-internStrings] [-leakedSystemProperties]
       [-manyThreads] [-stackOverflow]
    -bigArrayInt,--create-big-array-int                                    Creates a big array of ints
    -bigArrayInteger,--create-big-array-integer                            Creates a big array of
                                                                           integers
    -bigHashMap,--create-big-hashmap                                       Creates a big HashMap
    -bigList,--create-big-list                                             Creates a big List
    -crashJVM,--crash-jvm                                                  Crashes the JVM.
    -hashSetWithDuplicateEntries,--create-hashSet-with-duplicate-entries   Creates a HashSet with
                                                                           duplicate entries.
    -heapOverflow,--create-heapoverflow                                    Creates a heapoverflow.
    -internStrings,--create-intern-strings                                 Creates interalized strings.
    -leakedSystemProperties,--create-leaked-system-propertes               Creates a memory leak by
                                                                           creating system properties.
    -manyThreads,--create-many-threads                                     Creates many threads.
    -stackOverflow,--create-stackoverflow                                  Creates a stackoverflow.

# Compile
Just compile: `mvn clean install`

Compile and create runnable jar: `mvn clean compile assembly:single` The runnable jar will be created in the `target` folder.