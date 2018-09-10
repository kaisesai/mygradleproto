package com.liukai.service;

import com.liukai.proto.MetaModel;
import io.grpc.protobuf.ProtoUtils;

public class MyService {

  public static void main(String[] args) {

    MetaModel.Brand.Builder builder = MetaModel.Brand.newBuilder();
    MetaModel.Brand build = builder.setCountry("cn").setCoverPath("123232").build();

    System.out.println(build);

  }
}
