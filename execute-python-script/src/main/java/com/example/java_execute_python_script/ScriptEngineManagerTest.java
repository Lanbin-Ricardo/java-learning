package com.example.java_execute_python_script;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScriptEngineManagerTest {
    public static void main(String[] args) throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("python");
        System.out.println(new File("").getAbsolutePath());
        FileReader fr = new FileReader(ScriptEngineManagerTest.class.getClassLoader().getResource("python_script/hello_world.py").getFile());
        engine.put("name", "Sam");
        // Execute the script
        engine.put("names", List.of("Jack", "Jane", "Nik"));

        Map<String, Object> person = new HashMap<>();
        person.put("name", "Sam");
        person.put("age", 2);
        engine.put("person", person);

        engine.eval(fr);

        Invocable invocable = (Invocable) engine;
        Object result = invocable.invokeFunction("add", 5, 3);
        System.out.println("Result: " + result);
    }
}
