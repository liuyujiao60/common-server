package com.server.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.common.user.viewobject.UserBasicInfoVo;
import com.server.core.request.RequestEntity;
import com.server.remote.TestHealthRemote;
import com.server.remote.user.UserRemote;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.server.core.exception.DBExceptionEnums;
import com.server.core.exception.ServerException;
import com.server.viewobject.HeartBeatView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/testHealth")
public class TestHealthController {

	@Resource
	private TestHealthRemote testHealthRemote;
	@Resource
	private UserRemote userRemote;

	@ResponseBody
	@RequestMapping("/heartbeat")
	public Object heartBeat(){
		try{
			
		}catch(Exception e){
			throw new ServerException(DBExceptionEnums.UNKNOWN_REQUEST_ERROR,e);
		}
		return "heartBeatTest";
	}

	@ResponseBody
	@RequestMapping("/testCloudRemote")
	public Object testCloudRemote(){
		return userRemote.accountExistCheck(new RequestEntity<UserBasicInfoVo>());
	}
}
