package com.springbook.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springbook.biz.day02.user.UserVO;
import com.springbook.biz.day02.user.impl.UserDAO;

@Controller
public class LoginController {

  @RequestMapping(value = "/login.do", method = RequestMethod.GET)
  public String loginView(@ModelAttribute("user") UserVO vo) {
    System.out.println("로그인 화면으로 이동");
    vo.setId("test");
    vo.setPassword("test123");
    return "login.jsp";
  }

  @RequestMapping(value = "/login.do", method = RequestMethod.POST)
  public String login(UserVO vo, UserDAO userDAO) {
    System.out.println("로그인 인증 처리...");
    if (UserDAO.getUser(vo) != null)
      return "getBoardList.do";
    else
      return "login.jsp";
  }
}
