package de.hsba.bi.projectwork.web.task.suggestedtask;

import de.hsba.bi.projectwork.task.suggestedtask.SuggestedTask;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class SuggestedTaskFormConverter {

    public SuggestedTask convert(SuggestedTaskForm suggestedTaskForm) {
        SuggestedTask suggestedTask = new SuggestedTask();
        suggestedTask.setName(suggestedTaskForm.getName());
        suggestedTask.setStatus(SuggestedTask.Status.IDEA);
        suggestedTask.setDescription(suggestedTaskForm.getDescription());
        suggestedTask.setEstimation(suggestedTaskForm.getEstimation());
        suggestedTask.setProject(suggestedTaskForm.getProject());
        suggestedTask.setCreationDate(suggestedTaskForm.getCreationDate());
        suggestedTask.setCreator(suggestedTaskForm.getCreator());
        return suggestedTask;
    }

}
