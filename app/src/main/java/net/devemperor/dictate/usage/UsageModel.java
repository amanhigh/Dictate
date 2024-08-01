package net.devemperor.dictate.usage;

public class UsageModel {
    private final String modelName;
    private final long audioTime;
    private final long inputTokens;
    private final long outputTokens;

    public UsageModel(String modelName, long audioTime, long inputTokens, long outputTokens) {
        this.modelName = modelName;
        this.audioTime = audioTime;
        this.inputTokens = inputTokens;
        this.outputTokens = outputTokens;
    }

    public String getModelName() {
        return modelName;
    }

    public long getAudioTime() {
        return audioTime;
    }

    public long getInputTokens() {
        return inputTokens;
    }

    public long getOutputTokens() {
        return outputTokens;
    }
}
