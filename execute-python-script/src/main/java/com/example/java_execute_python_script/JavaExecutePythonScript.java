package com.example.java_execute_python_script;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JavaExecutePythonScript {
    public static void main(String[] args) throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("python");
        System.out.println(new File("").getAbsolutePath());
        FileReader fr = new FileReader(JavaExecutePythonScript.class.getClassLoader().getResource("python_script/hello_world.py").getFile());
        engine.put("name", "Sam");
        // Execute the script
        engine.put("names", List.of("Jack", "Jane", "Nik"));
        engine.eval(fr);
    }
}
