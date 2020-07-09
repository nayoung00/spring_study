package com.springbook.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springbook.biz.day02.user.UserVO;
import com.springbook.biz.day02.user.impl.UserDAO;

@Controller
public class LoginController {

  @RequestMapping("/login.do")
  public String login(UserVO vo, UserDAO userDAO) {
    if (UserDAO.getUser(vo) != null)
      return "getBoardList.do";
    else
      return "login.jsp";

  }

}
