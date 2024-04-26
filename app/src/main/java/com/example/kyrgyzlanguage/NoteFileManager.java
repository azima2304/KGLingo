package com.example.kyrgyzlanguage;

import android.content.Context;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NoteFileManager {
    private static final String FILE_NAME = "notes.json";

    public static void saveNotes(Context context, List<String> notes) {
        Gson gson = new Gson();
        String json = gson.toJson(notes);
        try (FileOutputStream fos = context.openFileOutput(FILE_NAME, Context.MODE_PRIVATE)) {
            fos.write(json.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> loadNotes(Context context) {
        List<String> notes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(context.getFileStreamPath(FILE_NAME)))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            Gson gson = new Gson();
            notes = gson.fromJson(sb.toString(), ArrayList.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return notes;
    }
}
