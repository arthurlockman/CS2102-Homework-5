#CS 2102 Homework 5

This repository is for WPI CS 2102 Homework 5. This assignment will be collaborated on by [Erin Ferguson](mailto:eeferguson@wpi.edu) and [Arthur Lockman](mailto:ajlockman@wpi.edu).

#Assignment Details

##Overview

Our goals this week are to practice programming with lists and writing clean, encapsulated code. You should aim to produce code that is well organized, uses helper methods and interfaces where appropriate, and follows good object-oriented design techniques. We will pay particular attention to these issues in grading your work.
This assignment is designed to help you think about where data and computations belong in a well-designed object-oriented program. Methods that produces the right answer, but aren't structured well, won't earn you many points. Figuring out where to put the various pieces of data, and what methods you need to create to work with them, are part of the what you are being asked to figure out.

##Part 1: The Weather Monitoring Tool

Your overall goal in this part of the assignment is to provide a program that reports weather trends. To keep things simple, we are interested in two trends: average daily high temperature during a particular month, and average daily low temperature during a particular month. To this end you need to create a <code>WeatherMonitor</code> class with (at least these) two methods:

* <code>averageHighForMonth</code>, which takes a month (designated by a number such as 1 for January, 2 for February, etc) and a year and produces the average high temperature over all days that month.*
* <code>averageLowForMonth</code>, which takes a month (designated by a number such as 1 for January, 2 for February, etc) and a year and produces the average low temperature over all days that month.*

The weather data you are tracking is initially gathered from a weather sensor. The sensor produces readings containing the time of the reading (hour and minutes) and the temperature in degrees Fahrenheit. Because the volume of readings is so high, your weather monitor will store only daily weather reports. A daily weather report contains the date (month, day, year) and two temperature readings: one for the lowest temperature of the day and one for the highest temperature of the day.

To manage the daily weather data, your <code>WeatherMonitor</code> must also provide a method <code>addDailyReport</code> that consumes a date and a list of readings (nominally for that date) and stores a daily report for the given date (computing the high and low temperature readings from the given list of readings for that date).

(* We won't actually require you to provide examples of daily weather reports for every single day in a month. Your calculations of <code>averageHighForMonth</code> and <code>averageLowForMonth</code> should produce the averages over all days in the month for which there are daily weather reports.)

##Part 2: Protecting and Encapsulating the Data

This set of exercises asks you to modify your code from Part 1 as needed to satisfy certain goals, then to give us brief descriptions of how you did so. Put your descriptions in a text file named <code>questions.txt</code>. You do not turn in separate code for these exercises: just modify your existing code as needed to meet these goals.

Thinking ahead, you know that the weather monitor program should be able to support different data structures for the daily weather reports. Edit your code as needed to encapsulate the type of the daily weather reports from the overall <code>WeatherMonitor</code> class. In <code>questions.txt</code>, explain what specifically in your code would achieve this goal. As part of your answer, explain where (which lines/expressions) someone would have to change in order to use a spanking new "weatherGlob" data structure instead of your current LinkedList implementation. (Note: you are NOT being asked to implement weatherGlob. Just assume such a class exists and tell us how someone would plug it into your code.)

The weather watchdog group that uses your Weather Monitor has an activist staff member who wants to find evidence of global warming, and is willing to alter weather data slightly to help his cause. The activist has access to a <code>WeatherMonitor</code> object. Edit your code as needed to guarantee that the staff member cannot change any of the daily weather reports or their readings. In <code>questions.txt</code>, explain what specifically in your code achieves this goal.

Look at the code you have now: are there any aspects of it that you would like to clean up, but don't yet know how in Java? Are you satisfied with your code from a design standpoint? Provide answers to these questions in <code>questions.txt</code>.

##Grading

Here is the general grading rubric for the assignments in this course.

**Programs must compile in order to receive credit. **Programs must run in order to receive credit for Examples and Test Cases. Code that is commented out will not be graded.

##What to Turn In

Using web-based turnin, submit .java files (as a .zip file) containing the final versions of all classes, interfaces, and examples developed for this assignment. Your .zip file should also contain the answers to the questions in the file <code>questions.txt</code>. Do not submit the .class files.