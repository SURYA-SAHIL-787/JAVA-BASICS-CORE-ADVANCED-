============================================================
1) JAVA BASICS & ENVIRONMENT
(CLARITY IS KEY – UNDERSTAND HOW JAVA WORKS INTERNALLY)
============================================================

------------------------------------------------------------
WHAT IS JAVA ?
------------------------------------------------------------
JAVA IS A:
- HIGH LEVEL PROGRAMMING LANGUAGE
- OBJECT ORIENTED LANGUAGE
- PLATFORM INDEPENDENT LANGUAGE

JAVA IS USED TO:
- BUILD APPLICATIONS
- RUN ON ANY SYSTEM WITH JVM
- DEVELOP ANDROID APPS, WEB APPS, ENTERPRISE SYSTEMS

WRITE ONCE, RUN ANYWHERE (WORA)


------------------------------------------------------------
WHY JAVA IS USED ?
------------------------------------------------------------
- EASY TO LEARN
- VERY SECURE
- PLATFORM INDEPENDENT
- HUGE COMMUNITY
- USED IN REAL-WORLD INDUSTRY


------------------------------------------------------------
FEATURES OF JAVA
------------------------------------------------------------
SIMPLE:
- EASY SYNTAX
- REMOVES COMPLEX FEATURES LIKE POINTERS

SECURE:
- NO DIRECT MEMORY ACCESS
- BYTECODE VERIFICATION
- JVM SECURITY

PORTABLE:
- SAME BYTECODE RUNS ON ALL PLATFORMS

ROBUST:
- STRONG MEMORY MANAGEMENT
- EXCEPTION HANDLING
- GARBAGE COLLECTION


------------------------------------------------------------
JDK vs JRE vs JVM (VERY IMPORTANT)
------------------------------------------------------------

JVM (JAVA VIRTUAL MACHINE):
- RUNS THE BYTECODE
- PLATFORM DEPENDENT
- EXECUTES JAVA PROGRAM

JRE (JAVA RUNTIME ENVIRONMENT):
- JVM + LIBRARIES
- REQUIRED TO RUN JAVA PROGRAMS

JDK (JAVA DEVELOPMENT KIT):
- JRE + COMPILER + TOOLS
- REQUIRED TO WRITE AND COMPILE JAVA PROGRAMS

RELATION:
JDK > JRE > JVM


------------------------------------------------------------
HOW JAVA CODE RUNS INTERNALLY
------------------------------------------------------------

SOURCE CODE (.JAVA)
        |
        V
JAVA COMPILER (JAVAC)
        |
        V
BYTECODE (.CLASS)
        |
        V
       JVM
        |
        V
EXECUTION (OUTPUT)


------------------------------------------------------------
BYTECODE & PLATFORM INDEPENDENCE
------------------------------------------------------------
- BYTECODE IS NOT MACHINE CODE
- BYTECODE RUNS INSIDE JVM
- EACH OS HAS ITS OWN JVM
- SAME BYTECODE WORKS EVERYWHERE

THIS IS WHY JAVA IS PLATFORM INDEPENDENT


------------------------------------------------------------
INSTALLING JAVA (JDK)
------------------------------------------------------------
STEPS:
1) DOWNLOAD JDK FROM OFFICIAL WEBSITE
2) INSTALL JDK
3) SET JAVA_HOME
4) SET PATH VARIABLE
5) VERIFY USING:
   java --version
   javac --version


------------------------------------------------------------
SETTING PATH & JAVA_HOME
------------------------------------------------------------

JAVA_HOME:
- POINTS TO JDK INSTALLATION DIRECTORY

PATH:
- ALLOWS JAVA COMMANDS TO RUN FROM ANYWHERE

WITHOUT PATH:
- JAVA COMMAND WILL NOT WORK


------------------------------------------------------------
WRITING YOUR FIRST JAVA PROGRAM
------------------------------------------------------------

FILE NAME:
HelloWorld.java

CODE:
--------------------------------
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
    }
}
--------------------------------


------------------------------------------------------------
JAVA PROGRAM STRUCTURE
------------------------------------------------------------
1) CLASS DECLARATION
2) MAIN METHOD
3) STATEMENTS INSIDE MAIN
4) EXECUTION STARTS FROM MAIN


------------------------------------------------------------
MAIN METHOD SIGNATURE
------------------------------------------------------------

public static void main(String[] args)

THIS IS FIXED.
JVM SEARCHES FOR THIS EXACT SIGNATURE.


------------------------------------------------------------
WHY EACH KEYWORD IS USED
------------------------------------------------------------

PUBLIC:
- JVM CAN ACCESS IT FROM ANYWHERE

STATIC:
- NO OBJECT NEEDED
- JVM CAN CALL IT DIRECTLY

VOID:
- RETURNS NOTHING

STRING[] ARGS:
- STORES COMMAND LINE ARGUMENTS


------------------------------------------------------------
COMMENTS IN JAVA
------------------------------------------------------------

SINGLE LINE COMMENT:
// THIS IS A SINGLE LINE COMMENT

MULTI LINE COMMENT:
/*
THIS IS A
MULTI LINE
COMMENT
*/

DOCUMENTATION COMMENT:
/**
 * THIS IS A DOCUMENTATION COMMENT
 * USED TO GENERATE JAVA DOCS
 */


============================================================
END OF JAVA BASICS & ENVIRONMENT
============================================================
