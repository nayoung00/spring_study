package com.springbook.biz.day02.user.impl;

import com.springbook.biz.day01.ex07.user.UserService;
import com.springbook.biz.day01.ex07.user.UserVO;

public class UserServiceImpl implements UserService {

  private UserDAO userDAO;

  public void setUserDAO(UserDAO userDAO) {
    this.userDAO = userDAO;

  }

  @Override
  public UserVO getUser(UserVO vo) {
    return UserDAO.getUser(vo);
  }

}
