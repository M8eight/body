package com.videohub.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class VideoAlreadyFavoriteException extends Exception {
    public VideoAlreadyFavoriteException() {
    }
}
