package com.example.service

import org.springframework.stereotype.Service

/**
  * Created by jinyong on 11/6/15.
  * email: jinyong1112@126.com
  */
@Service
class ScalaStringService {
  def reverse(s: String) = s.reverse
}

object ScalaStringService {
  def add(a: Int, b: Int) = a + b + 1
}
