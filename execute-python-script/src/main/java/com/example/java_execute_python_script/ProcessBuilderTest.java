package com.example.java_execute_python_script;

import com.example.pojo.Person;
import com.google.gson.Gson;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessBuilderTest {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        List<Person> personList = List.of(new Person("Sam", 2), new Person("Jack", 4));
        String json = gson.toJson(personList);
        // Create a ProcessBuilder to run the Python script
        File file = new File(ProcessBuilderTest.class.getClassLoader().getResource("python_script/hello_world_process_builder.py").getFile());
        ProcessBuilder processBuilder = new ProcessBuilder("python", file.getAbsolutePath(), "Sam", json);
        processBuilder.redirectErrorStream(true);

        // Start the process
        Process process = processBuilder.start();

        // Get the output from the Python script
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // Wait for the process to complete
        int exitCode = process.waitFor();
        System.out.println("Exited with code: " + exitCode);
    }
}
