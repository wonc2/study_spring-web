package org.example.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/board")
public class BoardController {
    /*
     * 메뉴에서 목록을 클릭했을 때
     * 요청 URL = /board/list
     *
     * 리스트 화면에서 페이지 번호를 클릭했을 때
     * 요청 URL = /board/list?page=2
     *
     * 리스트 화면에서 검색어를 입력하고 검색버튼을 클릭했을 때
     * 요청 URL = /board/list?opt=title&keyword=스프링
     *
     * 리스트 화면에서 정렬순서를 변경했을 때
     * 요청 URL = /board/list?sort=likes
     */

    // 한번이라도 안오는 경우가 있다면 required = false
    // 올수도 있고 안올수도 있는데 null 값이 오면 안되면 defaultValue 설정 해줘야함
    // 요청 URL 에서 올 수 있는 모든 파람 경우의수 생각해서 요청 핸들러 메서드의 매개변수로 받아야함

    @GetMapping("/list")
    public String list(@RequestParam(value = "page", required = false, defaultValue = "1") int page,
                       @RequestParam(name = "opt", required = false) String opt,
                       @RequestParam(name = "keyword", required = false) String keyword,
                       @RequestParam(name = "sort", required = false, defaultValue = "date") String sort) {
        Map<String, Object> param = new HashMap<>();
        param.put("page", page);
        param.put("opt", opt);
        param.put("keyword", keyword);
        param.put("sort", sort);
//        List<Board> board = boardService.getBoards(param);
        return "board/list";
    }
}