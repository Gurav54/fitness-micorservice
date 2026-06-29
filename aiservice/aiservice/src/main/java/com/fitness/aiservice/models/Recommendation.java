package com.fitness.aiservice.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "recommendation")
@Data
@Builder
public class Recommendation {

    private String Id;
    private String activityId;
    private String userId;
    private String recommendation;
    @CreatedDate
    private LocalDateTime createdAt;

    private List<String> improvements;
    private List<String> suggestions;
    private List<String> safety;


}
