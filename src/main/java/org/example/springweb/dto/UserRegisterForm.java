package org.example.springweb.dto;

import org.springframework.web.multipart.MultipartFile;

public class UserRegisterForm {
    private String id;
    private String name;
    private MultipartFile photofile;
    // form input에 file이 있으면  MultipartFile을 꼭 정의해야함
    // form input에 name이 같은 file이 여러개 있으면 List<MultipartFile> 로 해서 리스트에 담으면 됨
    // 다른 이름이면 MultipartFile 하나 더 만들어서 쓰면됨
}
