package com.springbook.ioc.injection;

import java.util.Map;

public class CollectionBean3 {
  private Map<String, String> addressList;

  public void setAddressList(Map<String, String> addressList) {
    this.addressList = addressList;
  }

  public Map<String, String> getAddressList() {
    return null;
  }


}
