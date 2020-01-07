package usecases;

import java.util.ArrayList;

import domain.ExerciseEntry;

public class ExerciseEntryAdd{
    private ArrayList<ExerciseEntry> entries;

    public ExerciseEntryAdd(ArrayList<ExerciseEntry> entries) {
        this.entries = entries;
    }

    public void execute(ExerciseEntry entry) {
        entries.add(entry);
    }
}
