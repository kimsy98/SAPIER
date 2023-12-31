package com.esfp.sapaier.domain.collection.model.dto.request;

import com.esfp.sapaier.domain.collection.repository.entity.CollectionEntity;
import com.esfp.sapaier.domain.collection.repository.entity.RequestEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
public class ModifyCollectionRequestDto {
    private String collectionId;
    private String collectionName;
    private List<RequestEntity> apiList;
    private List<CollectionEntity> collectionList;
    private String modifiedTime;
    private Boolean collapsed;

    public CollectionEntity modifyToEntity(String collectionId, String collectionName, List<RequestEntity> apiList, List<CollectionEntity> collectionList, Boolean collapsed) {
        return CollectionEntity.builder()
                .collectionId(collectionId)
                .collectionName(collectionName)
                .apiList(apiList)
                .collectionList(collectionList)
                .collapsed(collapsed)
                .modifiedTime(LocalDateTime.now())
                .build();
    }

}
