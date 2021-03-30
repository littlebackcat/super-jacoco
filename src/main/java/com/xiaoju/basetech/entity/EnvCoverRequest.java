package com.xiaoju.basetech.entity;

import lombok.Data;

/**
 * @description:
 * @author: charlynegaoweiwei
 * @time: 2020/4/26 7:52 PM
 */
@Data
public class EnvCoverRequest extends CoverBaseRequest{

    private String address;
    private int port;
    private String envType;
    //0,单机部署；1，集群部署
    private int deployType=0;
}