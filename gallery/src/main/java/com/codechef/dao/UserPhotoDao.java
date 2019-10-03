package com.codechef.dao;

import java.util.List;

import com.codechef.model.Photo;
import com.codechef.model.User;

public interface UserPhotoDao{

    public List<Photo> getImages(Integer albumId) throws Exception;

    public String addPhoto(Photo photo) throws Exception;
    public String addLikes(Photo photo) throws Exception;
}