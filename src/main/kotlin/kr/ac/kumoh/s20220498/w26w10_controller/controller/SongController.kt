package kr.ac.kumoh.s20220498.w26w10_controller.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController {

    @GetMapping("/songs")
    fun getSongs(): String {
        return "아이유노래"
    }
}