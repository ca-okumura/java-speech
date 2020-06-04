/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

/**
 *
 *
 * <pre>
 * Provides information to the recognizer that specifies how to process the
 * request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1.StreamingRecognitionConfig}
 */
public final class StreamingRecognitionConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1.StreamingRecognitionConfig)
    StreamingRecognitionConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StreamingRecognitionConfig.newBuilder() to construct.
  private StreamingRecognitionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StreamingRecognitionConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StreamingRecognitionConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private StreamingRecognitionConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.cloud.speech.v1.RecognitionConfig.Builder subBuilder = null;
              if (config_ != null) {
                subBuilder = config_.toBuilder();
              }
              config_ =
                  input.readMessage(
                      com.google.cloud.speech.v1.RecognitionConfig.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(config_);
                config_ = subBuilder.buildPartial();
              }

              break;
            }
          case 16:
            {
              singleUtterance_ = input.readBool();
              break;
            }
          case 24:
            {
              interimResults_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v1.SpeechProto
        .internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1.SpeechProto
        .internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1.StreamingRecognitionConfig.class,
            com.google.cloud.speech.v1.StreamingRecognitionConfig.Builder.class);
  }

  public static final int CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.speech.v1.RecognitionConfig config_;
  /**
   *
   *
   * <pre>
   * Required. Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The config.
   */
  @java.lang.Override
  public com.google.cloud.speech.v1.RecognitionConfig getConfig() {
    return config_ == null
        ? com.google.cloud.speech.v1.RecognitionConfig.getDefaultInstance()
        : config_;
  }
  /**
   *
   *
   * <pre>
   * Required. Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v1.RecognitionConfigOrBuilder getConfigOrBuilder() {
    return getConfig();
  }

  public static final int SINGLE_UTTERANCE_FIELD_NUMBER = 2;
  private boolean singleUtterance_;
  /**
   *
   *
   * <pre>
   * If `false` or omitted, the recognizer will perform continuous
   * recognition (continuing to wait for and process audio even if the user
   * pauses speaking) until the client closes the input stream (gRPC API) or
   * until the maximum time limit has been reached. May return multiple
   * `StreamingRecognitionResult`s with the `is_final` flag set to `true`.
   * If `true`, the recognizer will detect a single spoken utterance. When it
   * detects that the user has paused or stopped speaking, it will return an
   * `END_OF_SINGLE_UTTERANCE` event and cease recognition. It will return no
   * more than one `StreamingRecognitionResult` with the `is_final` flag set to
   * `true`.
   * </pre>
   *
   * <code>bool single_utterance = 2;</code>
   *
   * @return The singleUtterance.
   */
  @java.lang.Override
  public boolean getSingleUtterance() {
    return singleUtterance_;
  }

  public static final int INTERIM_RESULTS_FIELD_NUMBER = 3;
  private boolean interimResults_;
  /**
   *
   *
   * <pre>
   * If `true`, interim results (tentative hypotheses) may be
   * returned as they become available (these interim results are indicated with
   * the `is_final=false` flag).
   * If `false` or omitted, only `is_final=true` result(s) are returned.
   * </pre>
   *
   * <code>bool interim_results = 3;</code>
   *
   * @return The interimResults.
   */
  @java.lang.Override
  public boolean getInterimResults() {
    return interimResults_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (config_ != null) {
      output.writeMessage(1, getConfig());
    }
    if (singleUtterance_ != false) {
      output.writeBool(2, singleUtterance_);
    }
    if (interimResults_ != false) {
      output.writeBool(3, interimResults_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getConfig());
    }
    if (singleUtterance_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, singleUtterance_);
    }
    if (interimResults_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, interimResults_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.speech.v1.StreamingRecognitionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1.StreamingRecognitionConfig other =
        (com.google.cloud.speech.v1.StreamingRecognitionConfig) obj;

    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig().equals(other.getConfig())) return false;
    }
    if (getSingleUtterance() != other.getSingleUtterance()) return false;
    if (getInterimResults() != other.getInterimResults()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    hash = (37 * hash) + SINGLE_UTTERANCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSingleUtterance());
    hash = (37 * hash) + INTERIM_RESULTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getInterimResults());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1.StreamingRecognitionConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.StreamingRecognitionConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.StreamingRecognitionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.StreamingRecognitionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.StreamingRecognitionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.StreamingRecognitionConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.StreamingRecognitionConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.StreamingRecognitionConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.StreamingRecognitionConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.StreamingRecognitionConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.StreamingRecognitionConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.StreamingRecognitionConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.speech.v1.StreamingRecognitionConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Provides information to the recognizer that specifies how to process the
   * request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1.StreamingRecognitionConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1.StreamingRecognitionConfig)
      com.google.cloud.speech.v1.StreamingRecognitionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v1.SpeechProto
          .internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1.SpeechProto
          .internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1.StreamingRecognitionConfig.class,
              com.google.cloud.speech.v1.StreamingRecognitionConfig.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1.StreamingRecognitionConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (configBuilder_ == null) {
        config_ = null;
      } else {
        config_ = null;
        configBuilder_ = null;
      }
      singleUtterance_ = false;

      interimResults_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v1.SpeechProto
          .internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.StreamingRecognitionConfig getDefaultInstanceForType() {
      return com.google.cloud.speech.v1.StreamingRecognitionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.StreamingRecognitionConfig build() {
      com.google.cloud.speech.v1.StreamingRecognitionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.StreamingRecognitionConfig buildPartial() {
      com.google.cloud.speech.v1.StreamingRecognitionConfig result =
          new com.google.cloud.speech.v1.StreamingRecognitionConfig(this);
      if (configBuilder_ == null) {
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
      }
      result.singleUtterance_ = singleUtterance_;
      result.interimResults_ = interimResults_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.speech.v1.StreamingRecognitionConfig) {
        return mergeFrom((com.google.cloud.speech.v1.StreamingRecognitionConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1.StreamingRecognitionConfig other) {
      if (other == com.google.cloud.speech.v1.StreamingRecognitionConfig.getDefaultInstance())
        return this;
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
      }
      if (other.getSingleUtterance() != false) {
        setSingleUtterance(other.getSingleUtterance());
      }
      if (other.getInterimResults() != false) {
        setInterimResults(other.getInterimResults());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.speech.v1.StreamingRecognitionConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.speech.v1.StreamingRecognitionConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.speech.v1.RecognitionConfig config_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v1.RecognitionConfig,
            com.google.cloud.speech.v1.RecognitionConfig.Builder,
            com.google.cloud.speech.v1.RecognitionConfigOrBuilder>
        configBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return configBuilder_ != null || config_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The config.
     */
    public com.google.cloud.speech.v1.RecognitionConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null
            ? com.google.cloud.speech.v1.RecognitionConfig.getDefaultInstance()
            : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConfig(com.google.cloud.speech.v1.RecognitionConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConfig(com.google.cloud.speech.v1.RecognitionConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeConfig(com.google.cloud.speech.v1.RecognitionConfig value) {
      if (configBuilder_ == null) {
        if (config_ != null) {
          config_ =
              com.google.cloud.speech.v1.RecognitionConfig.newBuilder(config_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        configBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        config_ = null;
        onChanged();
      } else {
        config_ = null;
        configBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.speech.v1.RecognitionConfig.Builder getConfigBuilder() {

      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.speech.v1.RecognitionConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null
            ? com.google.cloud.speech.v1.RecognitionConfig.getDefaultInstance()
            : config_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v1.RecognitionConfig,
            com.google.cloud.speech.v1.RecognitionConfig.Builder,
            com.google.cloud.speech.v1.RecognitionConfigOrBuilder>
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.speech.v1.RecognitionConfig,
                com.google.cloud.speech.v1.RecognitionConfig.Builder,
                com.google.cloud.speech.v1.RecognitionConfigOrBuilder>(
                getConfig(), getParentForChildren(), isClean());
        config_ = null;
      }
      return configBuilder_;
    }

    private boolean singleUtterance_;
    /**
     *
     *
     * <pre>
     * If `false` or omitted, the recognizer will perform continuous
     * recognition (continuing to wait for and process audio even if the user
     * pauses speaking) until the client closes the input stream (gRPC API) or
     * until the maximum time limit has been reached. May return multiple
     * `StreamingRecognitionResult`s with the `is_final` flag set to `true`.
     * If `true`, the recognizer will detect a single spoken utterance. When it
     * detects that the user has paused or stopped speaking, it will return an
     * `END_OF_SINGLE_UTTERANCE` event and cease recognition. It will return no
     * more than one `StreamingRecognitionResult` with the `is_final` flag set to
     * `true`.
     * </pre>
     *
     * <code>bool single_utterance = 2;</code>
     *
     * @return The singleUtterance.
     */
    @java.lang.Override
    public boolean getSingleUtterance() {
      return singleUtterance_;
    }
    /**
     *
     *
     * <pre>
     * If `false` or omitted, the recognizer will perform continuous
     * recognition (continuing to wait for and process audio even if the user
     * pauses speaking) until the client closes the input stream (gRPC API) or
     * until the maximum time limit has been reached. May return multiple
     * `StreamingRecognitionResult`s with the `is_final` flag set to `true`.
     * If `true`, the recognizer will detect a single spoken utterance. When it
     * detects that the user has paused or stopped speaking, it will return an
     * `END_OF_SINGLE_UTTERANCE` event and cease recognition. It will return no
     * more than one `StreamingRecognitionResult` with the `is_final` flag set to
     * `true`.
     * </pre>
     *
     * <code>bool single_utterance = 2;</code>
     *
     * @param value The singleUtterance to set.
     * @return This builder for chaining.
     */
    public Builder setSingleUtterance(boolean value) {

      singleUtterance_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If `false` or omitted, the recognizer will perform continuous
     * recognition (continuing to wait for and process audio even if the user
     * pauses speaking) until the client closes the input stream (gRPC API) or
     * until the maximum time limit has been reached. May return multiple
     * `StreamingRecognitionResult`s with the `is_final` flag set to `true`.
     * If `true`, the recognizer will detect a single spoken utterance. When it
     * detects that the user has paused or stopped speaking, it will return an
     * `END_OF_SINGLE_UTTERANCE` event and cease recognition. It will return no
     * more than one `StreamingRecognitionResult` with the `is_final` flag set to
     * `true`.
     * </pre>
     *
     * <code>bool single_utterance = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSingleUtterance() {

      singleUtterance_ = false;
      onChanged();
      return this;
    }

    private boolean interimResults_;
    /**
     *
     *
     * <pre>
     * If `true`, interim results (tentative hypotheses) may be
     * returned as they become available (these interim results are indicated with
     * the `is_final=false` flag).
     * If `false` or omitted, only `is_final=true` result(s) are returned.
     * </pre>
     *
     * <code>bool interim_results = 3;</code>
     *
     * @return The interimResults.
     */
    @java.lang.Override
    public boolean getInterimResults() {
      return interimResults_;
    }
    /**
     *
     *
     * <pre>
     * If `true`, interim results (tentative hypotheses) may be
     * returned as they become available (these interim results are indicated with
     * the `is_final=false` flag).
     * If `false` or omitted, only `is_final=true` result(s) are returned.
     * </pre>
     *
     * <code>bool interim_results = 3;</code>
     *
     * @param value The interimResults to set.
     * @return This builder for chaining.
     */
    public Builder setInterimResults(boolean value) {

      interimResults_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If `true`, interim results (tentative hypotheses) may be
     * returned as they become available (these interim results are indicated with
     * the `is_final=false` flag).
     * If `false` or omitted, only `is_final=true` result(s) are returned.
     * </pre>
     *
     * <code>bool interim_results = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInterimResults() {

      interimResults_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1.StreamingRecognitionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1.StreamingRecognitionConfig)
  private static final com.google.cloud.speech.v1.StreamingRecognitionConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1.StreamingRecognitionConfig();
  }

  public static com.google.cloud.speech.v1.StreamingRecognitionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingRecognitionConfig> PARSER =
      new com.google.protobuf.AbstractParser<StreamingRecognitionConfig>() {
        @java.lang.Override
        public StreamingRecognitionConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StreamingRecognitionConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<StreamingRecognitionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamingRecognitionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v1.StreamingRecognitionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
