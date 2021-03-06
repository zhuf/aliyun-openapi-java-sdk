/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.iot.model.v20160104;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RevertRpcRequest extends RpcAcsRequest<RevertRpcResponse> {
	
	public RevertRpcRequest() {
		super("Iot", "2016-01-04", "RevertRpc");
	}

	private Long appKey;

	private String deviceId;

	private String rpcContent;

	private Integer timeOut;

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		putQueryParameter("DeviceId", deviceId);
	}

	public String getRpcContent() {
		return this.rpcContent;
	}

	public void setRpcContent(String rpcContent) {
		this.rpcContent = rpcContent;
		putQueryParameter("RpcContent", rpcContent);
	}

	public Integer getTimeOut() {
		return this.timeOut;
	}

	public void setTimeOut(Integer timeOut) {
		this.timeOut = timeOut;
		putQueryParameter("TimeOut", timeOut);
	}

	@Override
	public Class<RevertRpcResponse> getResponseClass() {
		return RevertRpcResponse.class;
	}

}
