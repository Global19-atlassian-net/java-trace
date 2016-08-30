/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.trace.spi.v1;

import com.google.api.gax.testing.MockGrpcService;
import com.google.devtools.cloudtrace.v1.TraceServiceGrpc;
import com.google.protobuf.GeneratedMessage;
import io.grpc.ServerServiceDefinition;
import java.util.List;

@javax.annotation.Generated("by GAPIC")
public class MockTraceService implements MockGrpcService {
  private MockTraceServiceImpl serviceImpl;

  public MockTraceService() {
    serviceImpl = new MockTraceServiceImpl();
  }

  @Override
  public List<GeneratedMessage> getRequests() {
    return serviceImpl.getRequests();
  }

  @Override
  public void setResponses(List<GeneratedMessage> responses) {
    serviceImpl.setResponses(responses);
  }

  @Override
  public ServerServiceDefinition getServiceDefinition() {
    return TraceServiceGrpc.bindService(serviceImpl);
  }

  @Override
  public void reset() {
    serviceImpl.reset();
  }
}
